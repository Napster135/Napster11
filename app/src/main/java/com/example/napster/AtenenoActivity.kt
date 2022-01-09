package com.example.napster

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_ateneo.*
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem


private val list = mutableListOf<CarouselItem>()

class AtenenoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ateneo)

        list.add(CarouselItem(R.drawable.ateneo))
        list.add(CarouselItem(R.drawable.ateneo1))
        list.add(CarouselItem(R.drawable.ateneo2))
        list.add(CarouselItem(R.drawable.ateneo3))
        list.add(CarouselItem(R.drawable.ateneo4))
        list.add(CarouselItem(R.drawable.ateneo5))
        list.add(CarouselItem(R.drawable.ateneo6))
        carousel7.addData(list)
    }
}