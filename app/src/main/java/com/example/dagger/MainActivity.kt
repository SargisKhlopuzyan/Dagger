package com.example.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger.car.Car
import com.example.dagger.dagger.component.ActivityComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car1: Car

    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activityComponent: ActivityComponent =
//            (application as ExampleApp).getAppComponent().getActivityComponentBuilder()
//                .engineCapacity(150)
//                .horsePower(120)
//                .build()

            (application as ExampleApp).getAppComponent().getActivityComponentFactory()
                .create(150, 120)

        activityComponent.inject(this)
//        activityComponent.getCar()

        car1.drive()
        car2.drive()
    }
}