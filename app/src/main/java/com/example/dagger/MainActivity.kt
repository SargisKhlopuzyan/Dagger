package com.example.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger.car.Car
import com.example.dagger.dagger.component.CarComponent
import com.example.dagger.dagger.component.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car1: Car

    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val component: CarComponent = DaggerCarComponent.create()

        val component: CarComponent = DaggerCarComponent.builder()
            .horsePower(150)
            .engineCapacity(1400)
//            .dieselEngineModule(DieselEngineModule(100))
            .build()

        component.inject(this)
//        car1 = component.getCar()

        car1.drive()
        car2.drive()
    }
}