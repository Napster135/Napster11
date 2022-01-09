package com.example.napster

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_primavera.*
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

private val list = mutableListOf<CarouselItem>()

class PrimaveraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primavera)

        list.add(CarouselItem(R.drawable.primavera))
        list.add(CarouselItem(R.drawable.primavera1))
        list.add(CarouselItem(R.drawable.primavera2))
        list.add(CarouselItem(R.drawable.primavera3))
        list.add(CarouselItem(R.drawable.primavera4))
        list.add(CarouselItem(R.drawable.primavera5))
        list.add(CarouselItem(R.drawable.primavera6))
        list.add(CarouselItem(R.drawable.primavera7))
        list.add(CarouselItem(R.drawable.primavera8))
        list.add(CarouselItem(R.drawable.primavera9))
        list.add(CarouselItem(R.drawable.primavera10))
        list.add(CarouselItem(R.drawable.primavera11))
        list.add(CarouselItem(R.drawable.primavera12))
        carousel12.addData(list)












    }
}