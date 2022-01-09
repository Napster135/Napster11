package com.example.napster

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_rosedal.*
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

private val list = mutableListOf<CarouselItem>()

class RosedalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rosedal)

        list.add(CarouselItem(R.drawable.rosedal))
        list.add(CarouselItem(R.drawable.rosedal1))
        list.add(CarouselItem(R.drawable.rosedal2))
        list.add(CarouselItem(R.drawable.rosedal3))
        carousel8.addData(list)


    }
}