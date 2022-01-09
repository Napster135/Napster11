package com.example.napster

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_floreriabar.*
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem


private val list = mutableListOf<CarouselItem>()

class FloreriabarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_floreriabar)

        list.add(CarouselItem(R.drawable.floreria))
        list.add(CarouselItem(R.drawable.floreria1))
        list.add(CarouselItem(R.drawable.floreria2))
        list.add(CarouselItem(R.drawable.floreria3))
        list.add(CarouselItem(R.drawable.floreria4))
        list.add(CarouselItem(R.drawable.floreria5))
        carousel9.addData(list)






    }
}