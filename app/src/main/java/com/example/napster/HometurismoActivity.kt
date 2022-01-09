package com.example.napster

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_hometurismo.*

class HometurismoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hometurismo)


        imageButtonrosedal.setOnClickListener() {
            showHome1()

        }
        imageButtonbarracas.setOnClickListener() {
            showHome2()

        }
        imageButtonlaboca.setOnClickListener() {
            showHome3()

        }
        imageButtontunel.setOnClickListener() {
            showHome4()

        }
        imageButtonateneo.setOnClickListener() {
            showHome5()

        }
        imageButtonmural.setOnClickListener() {
            showHome6()
        }
    }
    private fun showHome1() {
        val homeIntent = Intent(this, RosedalActivity::class.java).apply {        }
        startActivity(homeIntent)
    }
    private fun showHome2() {
        val homeIntent = Intent(this, BarracasActivity::class.java).apply {        }
        startActivity(homeIntent)
    }private fun showHome3() {
        val homeIntent = Intent(this, BibliotecabocaActivity::class.java).apply {        }
        startActivity(homeIntent)
    }private fun showHome4() {
        val homeIntent = Intent(this, TunelesActivity::class.java).apply {        }
        startActivity(homeIntent)
    }
    private fun showHome5() {
        val homeIntent = Intent(this, AtenenoActivity::class.java).apply {        }
        startActivity(homeIntent)
    }
    private fun showHome6() {
        val homeIntent = Intent(this, MuralesActivity::class.java).apply {        }
        startActivity(homeIntent)
    }


}