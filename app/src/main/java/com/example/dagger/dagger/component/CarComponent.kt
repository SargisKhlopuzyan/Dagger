package com.example.dagger.dagger.component

import com.example.dagger.MainActivity
import com.example.dagger.car.Car
import com.example.dagger.dagger.module.PetrolEngineModule
import com.example.dagger.dagger.module.WheelsModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

/**
 * Created by FastShift, Inc., on 11/26/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */
@Component(modules = [WheelsModule::class, PetrolEngineModule::class])
//@Component(modules = [WheelsModule::class, DieselEngineModule::class])
interface CarComponent {
    fun getCar(): Car
    fun inject(activity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("horsePower") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engineCapacity") engineCapacity: Int): Builder

        fun build(): CarComponent
    }

}