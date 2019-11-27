package com.example.dagger.dagger.module

import com.example.dagger.car.DieselEngine
import com.example.dagger.car.Engine
import dagger.Module
import dagger.Provides

/**
 * Created by FastShift, Inc., on 11/27/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */
@Module
class DieselEngineModule(private var horsePower: Int) {

    @Provides
    fun provideEngine(engine: DieselEngine): Engine {
        return engine
    }

    @Provides
    fun provideHorsePower(): Int {
        return horsePower
    }

}