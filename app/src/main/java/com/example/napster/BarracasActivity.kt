package com.example.napster

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

private val list = mutableListOf<CarouselItem>()

class BarracasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barracas)


        val carousel : ImageCarousel = findViewById(R.id.carousel6)
        list.add(CarouselItem(R.drawable.barracas))
        list.add(CarouselItem(R.drawable.barracas1))
        list.add(CarouselItem(R.drawable.barracas2))
        list.add(CarouselItem(R.drawable.barracas3))
        list.add(CarouselItem(R.drawable.barracas4))
        list.add(CarouselItem(R.drawable.barracas5))
        list.add(CarouselItem(R.drawable.barracas6))
        list.add(CarouselItem(R.drawable.barracas7))
        list.add(CarouselItem(R.drawable.barracas8))
        list.add(CarouselItem(R.drawable.barracas9))

        carousel.addData(list)
    }
}