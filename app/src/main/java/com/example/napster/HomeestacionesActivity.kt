package com.example.napster

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_homeestaciones.*

class HomeestacionesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homeestaciones)

        imageButtonotono.setOnClickListener() {
            showHome1()

        }
        imageButtonverno.setOnClickListener() {
            showHome2()

        }
        imageButtonprimavera.setOnClickListener() {
            showHome3()

        }
        imageButtoninvierno.setOnClickListener() {
            showHome4()
        }
    }
        private fun showHome1() {
            val homeIntent = Intent(this, OtonoActivity::class.java).apply {        }
            startActivity(homeIntent)
        }
        private fun showHome2() {
            val homeIntent = Intent(this, VeranoActivity::class.java).apply {        }
            startActivity(homeIntent)
        }
        private fun showHome3() {
            val homeIntent = Intent(this, PrimaveraActivity::class.java).apply {        }
            startActivity(homeIntent)
        }
        private fun showHome4() {
            val homeIntent = Intent(this, InviernoActivity::class.java).apply {        }
            startActivity(homeIntent)
        }



}