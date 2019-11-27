package com.example.dagger.module

import com.example.dagger.dagger_objects.Engine
import com.example.dagger.dagger_objects.PetrolEngine
import dagger.Module
import dagger.Provides

/**
 * Created by FastShift, Inc., on 11/27/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */
@Module
class PetrolEngineModule {

    @Provides
    fun providesPetrolEngine(engine: PetrolEngine): Engine {
        return engine
    }

}