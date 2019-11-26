package com.example.dagger.dagger_objects

import android.util.Log
import javax.inject.Inject

/**
 * Created by FastShift, Inc., on 11/26/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */
class Car {

    @Inject
    constructor(engine: Engine, wheels: Wheels)

//    @Inject lateinit var engine: Engine
//
//    @Inject lateinit var wheels: Wheels


    fun drive() {
        Log.e(TAG,"Car -> drive()")
    }

    companion object {
        private const val TAG: String = "Car"
    }

}