package com.example.dagger.dagger.component

import com.example.dagger.car.Driver
import com.example.dagger.dagger.module.DieselEngineModule
import com.example.dagger.dagger.module.DriverModule
import com.example.dagger.dagger.module.PetrolEngineModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by FastShift, Inc., on 11/28/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */
@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {

//    fun getDriver(): Driver

    /**
     * Factory method
     * fun getActivityComponent(dieselEngineModule: DieselEngineModule, ...): ActivityComponent
     * */
//    fun getActivityComponentBuilder(): ActivityComponent.Builder
    fun getActivityComponentFactory(): ActivityComponent.Factory

}