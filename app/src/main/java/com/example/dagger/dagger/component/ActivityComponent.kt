package com.example.dagger.dagger.component

import com.example.dagger.MainActivity
import com.example.dagger.car.Car
import com.example.dagger.dagger.module.PetrolEngineModule
import com.example.dagger.dagger.module.WheelsModule
import com.example.dagger.dagger.scop.PerActivity
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named

/**
 * Created by FastShift, Inc., on 11/26/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */
@PerActivity
@Subcomponent(
    modules = [WheelsModule::class, PetrolEngineModule::class]
)
interface ActivityComponent {

    fun getCar(): Car
    fun inject(activity: MainActivity)

    @Subcomponent.Builder
    interface Builder {

//    fun appComponent(appComponent: AppComponent): Builder

    @BindsInstance
    fun horsePower(@Named("horsePower") horsePower: Int): Builder

    @BindsInstance
    fun engineCapacity(@Named("engineCapacity") engineCapacity: Int): Builder

    fun build(): ActivityComponent
    }

}