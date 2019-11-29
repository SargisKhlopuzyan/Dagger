package com.example.dagger.dagger.module

import com.example.dagger.car.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by FastShift, Inc., on 11/28/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */
/*
@Module
abstract class DriverModule {

    @Module
    companion object {

        @Provides
        @JvmStatic
        @Singleton
        fun provideDriver(): Driver {
            return Driver()
        }
    }
}
*/

@Module
class DriverModule constructor(var name: String) {

    @Provides
    @Singleton
    fun provideDriver(): Driver {
        return Driver(name)
    }

}