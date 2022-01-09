package com.example.napster

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class BibliotecabocaActivity : AppCompatActivity() {

    private val list = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bibliotecaboca)

        val carousel: ImageCarousel = findViewById(R.id.carousel5)
        list.add(CarouselItem(R.drawable.libreria))
        list.add(CarouselItem(R.drawable.libreria1))
        list.add(CarouselItem(R.drawable.libreria2))
        list.add(CarouselItem(R.drawable.libreria3))
        list.add(CarouselItem(R.drawable.libreria4))
        list.add(CarouselItem(R.drawable.libreria5))
        list.add(CarouselItem(R.drawable.libreria6))
        list.add(CarouselItem(R.drawable.libreria7))
        carousel.addData(list)
     }
}