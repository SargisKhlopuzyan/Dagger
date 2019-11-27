package com.example.dagger.module

import com.example.dagger.dagger_objects.DieselEngine
import com.example.dagger.dagger_objects.Engine
import dagger.Module
import dagger.Provides

/**
 * Created by FastShift, Inc., on 11/27/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */
@Module
class DieselEngineModule {

    @Provides
    fun providesDieselEngine(engine: DieselEngine): Engine {
        return engine
    }

}