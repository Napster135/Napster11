package com.example.napster

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class CasteloActivity : AppCompatActivity(){

    private val list = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_castelo)
            val carousel: ImageCarousel = findViewById(R.id.carousel1)
        list.add(CarouselItem(R.drawable.castelo))
        list.add(CarouselItem(R.drawable.castelo1))
        list.add(CarouselItem(R.drawable.castelo2))
        list.add(CarouselItem(R.drawable.castelo3))
        list.add(CarouselItem(R.drawable.castelo4))
        list.add(CarouselItem(R.drawable.castelo5))
        list.add(CarouselItem(R.drawable.castelo6))
        list.add(CarouselItem(R.drawable.castelo7))
        list.add(CarouselItem(R.drawable.castelo8))
        carousel.addData(list)


     }
}