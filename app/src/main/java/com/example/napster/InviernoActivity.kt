package com.example.napster

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_invierno.*
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class InviernoActivity : AppCompatActivity() {

    private val list = mutableListOf<CarouselItem>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_invierno)

        list.add(CarouselItem(R.drawable.invierno))
        list.add(CarouselItem(R.drawable.invierno1))
        list.add(CarouselItem(R.drawable.invierno2))
        list.add(CarouselItem(R.drawable.invierno3))
        carousel11.addData(list)

    }
}