package com.example.napster

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class TunelesActivity : AppCompatActivity() {

    private val list = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuneles)

        val carousel: ImageCarousel = findViewById(R.id.carousel4)
        list.add(CarouselItem(R.drawable.tunel))
        list.add(CarouselItem(R.drawable.tunel1))
        list.add(CarouselItem(R.drawable.tunel2))
        list.add(CarouselItem(R.drawable.tunel3))
        list.add(CarouselItem(R.drawable.tunel3))
        list.add(CarouselItem(R.drawable.tunel4))
        list.add(CarouselItem(R.drawable.tunel5))
        list.add(CarouselItem(R.drawable.tunel6))
        list.add(CarouselItem(R.drawable.tunel7))
        list.add(CarouselItem(R.drawable.tunel8))
         carousel.addData(list)
    }
}