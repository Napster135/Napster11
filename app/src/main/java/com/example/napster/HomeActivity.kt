package com.example.napster

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.facebook.login.LoginManager
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_home.*


enum class  ProviderType{
        BASIC,
        GOOGLE,
        FACEBOOK


}
class HomeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        //setup
        val bundle = intent.extras
        val email = bundle?.getString("email")
        val provider = bundle?.getString("provider")
        setup(email ?: "", provider ?: "")


        //ACA GUARDAMOS EMAIL Y PROVEEDOR EN CASO QUE LA APP SE CIERRE
        val prefs =
            getSharedPreferences(getString(R.string.prefs_file), Context.MODE_PRIVATE).edit()
        prefs.putString("email", email)
        prefs.putString("provider", provider)
        prefs.apply()


    }


    private fun setup(email: String, provider: String) {
        title = "Inicio"
        emailTextView.text = email
        providerTextView.text = provider

        logOutButton.setOnClickListener {

            //Borrado de datos

            val prefs =
                getSharedPreferences(getString(R.string.prefs_file), Context.MODE_PRIVATE).edit()
            prefs.clear()
            prefs.apply()

            if (provider == ProviderType.FACEBOOK.name) {
                LoginManager.getInstance().logOut()
            }
            FirebaseAuth.getInstance().signOut()
            onBackPressed()
        }

        /*imagenButton.setOnClickListener() {
            showHome1()

        }

        imagenButton1.setOnClickListener() {
            showHome2()

        }

        imagenButton2.setOnClickListener() {
            showHome3()

        }
        imagenButton3.setOnClickListener() {
            showHome4()

        }
    }
        private fun showHome1() {

            val homeIntent = Intent(this, SecondActivity::class.java).apply {

            }

            startActivity(homeIntent)
        }

        private fun showHome2() {

            val homeIntent = Intent(this, CarruselActivity::class.java).apply {

            }

            startActivity(homeIntent)
        }

        private fun showHome3() {

            val homeIntent = Intent(this, CasteloActivity::class.java).apply {

            }

            startActivity(homeIntent)
        }

        private fun showHome4() {

            val homeIntent = Intent(this, TunelesActivity::class.java).apply {


            }
            startActivity(homeIntent)
        }*/
    }
}
