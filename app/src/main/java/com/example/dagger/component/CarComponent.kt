package com.example.dagger.component

import com.example.dagger.MainActivity
import com.example.dagger.dagger_objects.Car
import com.example.dagger.module.DieselEngineModule
import com.example.dagger.module.WheelsModule
import dagger.Component

/**
 * Created by FastShift, Inc., on 11/26/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */
@Component(modules = [WheelsModule::class, DieselEngineModule::class])
interface CarComponent {
    fun getCar(): Car
    fun inject(activity: MainActivity)
}