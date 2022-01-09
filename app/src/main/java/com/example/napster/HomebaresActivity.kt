package com.example.napster

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_homerestaurante.*
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

private val list = mutableListOf<CarouselItem>()

class HomebaresActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homebares)

        imageButtonatis.setOnClickListener() {
            showHome1()

        }

    }
    private fun showHome1() {
        val homeIntent = Intent(this, CarruselActivity::class.java).apply {        }
        startActivity(homeIntent)
    }
}