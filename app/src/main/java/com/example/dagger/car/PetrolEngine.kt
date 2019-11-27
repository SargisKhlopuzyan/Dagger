package com.example.dagger.car

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

/**
 * Created by FastShift, Inc., on 11/27/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */
class PetrolEngine @Inject constructor(
    @Named("horsePower") private var horsePower: Int,
    @Named("engineCapacity") private var engineCapacity: Int
) : Engine {

    override fun start() {
        Log.e(
            TAG,
            "Petrol engine started. \nHorsePower: $horsePower \nEngineCapacity: $engineCapacity"
        )
    }

    companion object {
        private const val TAG: String = "Car"
    }
}