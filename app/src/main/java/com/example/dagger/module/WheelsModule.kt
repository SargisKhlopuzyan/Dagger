package com.example.dagger.module

import com.example.dagger.dagger_objects.Rims
import com.example.dagger.dagger_objects.Tires
import com.example.dagger.dagger_objects.Wheels
import dagger.Module
import dagger.Provides

/**
 * Created by FastShift, Inc., on 11/26/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */
@Module
class WheelsModule {

    @Module
    companion object {

        @Provides
        @JvmStatic
        fun providesRims(): Rims {
            return Rims()
        }

        @Provides
        @JvmStatic
        fun providesTires(): Tires {
            val tires = Tires()
            tires.inflate()
            return tires
        }

        @Provides
        @JvmStatic
        fun providesWheels(rims: Rims, tires: Tires): Wheels {
            return Wheels(rims = rims, tires = tires)
        }

    }
}