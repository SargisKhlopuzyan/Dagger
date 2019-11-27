package com.example.dagger.dagger.module

import com.example.dagger.car.Engine
import com.example.dagger.car.PetrolEngine
import dagger.Binds
import dagger.Module

/**
 * Created by FastShift, Inc., on 11/27/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */
@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindEngine(engine: PetrolEngine): Engine

}