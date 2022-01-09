package com.example.napster

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class CarruselActivity : AppCompatActivity() {

    private val list = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_carrusel)
            val carousel : ImageCarousel = findViewById(R.id.carousel2)
        list.add(CarouselItem(R.drawable.atis))
        list.add(CarouselItem(R.drawable.atis1))
        list.add(CarouselItem(R.drawable.atis2))
        list.add(CarouselItem(R.drawable.atis3))
        list.add(CarouselItem(R.drawable.atis4))
        list.add(CarouselItem(R.drawable.atis5))
        list.add(CarouselItem(R.drawable.atis6))
        list.add(CarouselItem(R.drawable.atis7))
        list.add(CarouselItem(R.drawable.atis8))
        list.add(CarouselItem(R.drawable.atis9))
        list.add(CarouselItem(R.drawable.atis10))
        list.add(CarouselItem(R.drawable.atis11))
        carousel.addData(list)



    }

}