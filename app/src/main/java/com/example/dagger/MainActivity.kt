package com.example.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger.car.Car
import com.example.dagger.dagger.component.CarComponent
import com.example.dagger.dagger.component.DaggerCarComponent
import com.example.dagger.dagger.module.DieselEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val component: CarComponent = DaggerCarComponent.create()

        val component: CarComponent = DaggerCarComponent.builder()
            .horsePower(150)
            .engineCapacity(100)
//            .dieselEngineModule(DieselEngineModule(100))
            .build()

        component.inject(this)
//        car = component.getCar()

        car.drive()
    }
}