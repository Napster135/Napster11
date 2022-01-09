package com.example.napster

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.napster.databinding.ActivityAuthBinding
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.auth.FacebookAuthProvider
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import kotlinx.android.synthetic.main.activity_auth.*


class AuthActivity :    AppCompatActivity() {

    private val GOOGLE_SIGN_IN = 100

    private val callbackManager = CallbackManager.Factory.create()

    private lateinit var binding: ActivityAuthBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_auth)
        setContentView(binding.root)


        //Analitics Even


        val analytics = FirebaseAnalytics.getInstance(this)
        val bundle = Bundle()
        bundle.putString("message", "Integración de Firebase Completa")
        analytics.logEvent("InitScreem", bundle)

        //Setup
        setup()
        session()
    }

    override fun onStart() {
        super.onStart()

        passwordText.visibility = View.VISIBLE
    }


    private fun session() {
        val prefs =
            getSharedPreferences(getString(R.string.prefs_file), Context.MODE_PRIVATE)/*.edit*/
        val email = prefs.getString("email", null)
        val provider = prefs.getString("provider", null)

        if (email != null && provider != null) {
            passwordText.visibility = View.INVISIBLE
            showHome(email, ProviderType.valueOf(provider))
        }
    }

    private fun setup() {

        title = "Autenticación"


        binding.signUpButton.setOnClickListener {
            if (emailEditText.text.isNotEmpty() && passwordEditText.text.isNotEmpty()) {

                FirebaseAuth.getInstance()
                    .createUserWithEmailAndPassword(
                        emailEditText.text.toString(),
                        passwordEditText.text.toString()
                    ).addOnCompleteListener {

                        if (it.isSuccessful) {
                            showHome(it.result?.user?.email ?: "", ProviderType.BASIC)
                        } else {
                            showAlert()
                        }
                    }
            }
        }

        logInButton.setOnClickListener {
            if (emailEditText.text.isNotEmpty() && passwordEditText.text.isNotEmpty()) {

                FirebaseAuth.getInstance()
                    .signInWithEmailAndPassword(
                        emailEditText.text.toString(),
                        passwordEditText.text.toString()
                    ).addOnCompleteListener {

                        if (it.isSuccessful) {
                            showHome(it.result?.user?.email ?: "", ProviderType.BASIC)
                        } else {
                            showAlert()
                        }
                    }
            }

        }


        googleButton.setOnClickListener {

            //Congifuración

            val googleConf =
                GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                    .requestIdToken(getString(R.string.default_web_client_id))
                    .requestEmail()
                    .build()

            val googleClient = GoogleSignIn.getClient(this, googleConf)
            googleClient.signOut()
            startActivityForResult(googleClient.signInIntent, GOOGLE_SIGN_IN)

        }

        facebookButton.setOnClickListener {
            LoginManager.getInstance().logInWithReadPermissions(this, listOf("email"))
            LoginManager.getInstance().registerCallback(callbackManager,
                object : FacebookCallback<LoginResult> {

                    override fun onSuccess(result: LoginResult?) {
                        result?.let {
                            val token = it.accessToken

                            val credential = FacebookAuthProvider.getCredential(token.token)
                            FirebaseAuth.getInstance().signInWithCredential(credential)
                                .addOnCompleteListener {
                                    if (it.isSuccessful) {
                                        showHome(
                                            it.result?.user?.email ?: "",
                                            ProviderType.FACEBOOK
                                        )
                                    } else {
                                        showAlert()
                                    }
                                }
                        }
                    }

                    override fun onCancel() {

                    }

                    override fun onError(error: FacebookException?) {

                        showAlert()
                    }


                })


        }

    }

    private fun showAlert() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Se ha producido un error autenticando al usuario")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()

    }

    private fun showHome(email: String, provider: ProviderType) {

        val homeIntent = Intent(this, PrincipalActivity::class.java).apply {

            putExtra("email", email)
            putExtra("provider", provider.name)
        }

        startActivity(homeIntent)
    }

    /*private  fun showImagenes (email: String,provider: ProviderType){

            val homeIntent = Intent (this, Second::class.java).apply {
                putExtra("email",email)
                putExtra("provider", provider.name)

            }
            startActivity(homeIntent)

            }
        }*/

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        callbackManager.onActivityResult(requestCode, resultCode, data)
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == GOOGLE_SIGN_IN) {

            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            try {
                val account = task.getResult(ApiException::class.java)

                if (account != null) {

                    val credential = GoogleAuthProvider.getCredential(account.idToken, null)

                    FirebaseAuth.getInstance().signInWithCredential(credential)
                        .addOnCompleteListener {


                            if (it.isSuccessful) {
                                showHome(account.email ?: "", ProviderType.GOOGLE)
                            } else {
                                showAlert()

                            }


                        }
                }

            } catch (e: ApiException) {
                showAlert()
            }
        }
    }


    }
