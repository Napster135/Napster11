package com.example.napster

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_murales.*
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem


class VeranoActivity : AppCompatActivity() {


    private val list = mutableListOf<CarouselItem>()

     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verano)

        list.add(CarouselItem(R.drawable.verano))
         list.add(CarouselItem(R.drawable.verano1))
         list.add(CarouselItem(R.drawable.verano2))
         list.add(CarouselItem(R.drawable.verano3))
         list.add(CarouselItem(R.drawable.verano4))
         list.add(CarouselItem(R.drawable.verano5))
         carousel13.addData(list)






     }
}