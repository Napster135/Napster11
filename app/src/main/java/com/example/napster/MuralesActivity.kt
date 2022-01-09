package com.example.napster

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_murales.*
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class MuralesActivity : AppCompatActivity() {
    private val list = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_murales)


        list.add(CarouselItem(R.drawable.mural))
        list.add(CarouselItem(R.drawable.mural1))
        list.add(CarouselItem(R.drawable.mural2))
        list.add(CarouselItem(R.drawable.mural3))
        list.add(CarouselItem(R.drawable.mural4))
        list.add(CarouselItem(R.drawable.mural5))
        list.add(CarouselItem(R.drawable.muralotro))
        carousel13.addData(list)
    }
}