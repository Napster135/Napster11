package com.example.napster

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_principal.*

class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)



        imageViewbares.setOnClickListener() {
            showHome1()

        }
        imageViewrestaurantes.setOnClickListener() {
            showHome2()

        }
        imageViewturismo.setOnClickListener() {
            showHome3()

        }
        imageViewestaciones.setOnClickListener() {
            showHome4()

        }
    }
    private fun showHome1() {
        val homeIntent = Intent(this, HomebaresActivity::class.java).apply {        }
        startActivity(homeIntent)
    }
    private fun showHome2() {
        val homeIntent = Intent(this, HomerestauranteActivity::class.java).apply {        }
        startActivity(homeIntent)
    }
    private fun showHome3() {
        val homeIntent = Intent(this, HometurismoActivity::class.java).apply {        }
        startActivity(homeIntent)
    }
    private fun showHome4() {
        val homeIntent = Intent(this, HomeestacionesActivity::class.java).apply {        }
        startActivity(homeIntent)
    }

}