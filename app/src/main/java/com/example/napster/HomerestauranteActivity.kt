package com.example.napster

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_homerestaurante.*


class HomerestauranteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homerestaurante)

        imageButtonatis.setOnClickListener() {
            showHome1()

        }

        imageButtoncastelo.setOnClickListener() {
            showHome2()

        }


    }


    private fun showHome1() {

        val homeIntent = Intent(this, CarruselActivity::class.java).apply {

        }

        startActivity(homeIntent)
    }


    private fun showHome2() {

        val homeIntent = Intent(this, CasteloActivity::class.java).apply {

        }

        startActivity(homeIntent)
    }


}




