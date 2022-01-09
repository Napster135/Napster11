package com.example.napster

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_otono.*
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class OtonoActivity : AppCompatActivity() {

    private val list = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otono)

        list.add(CarouselItem(R.drawable.otono))
        list.add(CarouselItem(R.drawable.otono1))
        list.add(CarouselItem(R.drawable.otono2))
        list.add(CarouselItem(R.drawable.otono3))
        list.add(CarouselItem(R.drawable.otono4))
        list.add(CarouselItem(R.drawable.otono5))
        list.add(CarouselItem(R.drawable.otono6))
        list.add(CarouselItem(R.drawable.otono7))
        carousel10.addData(list)




    }
}