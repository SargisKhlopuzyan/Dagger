package com.example.dagger.dagger_objects

import android.util.Log
import javax.inject.Inject

/**
 * Created by FastShift, Inc., on 11/26/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */
class Car {

    @Inject lateinit var engine: Engine
//    @Inject lateinit var wheels: Wheels

    @Inject
    constructor(wheels: Wheels)

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    fun drive() {
        engine.start()
        Log.e(TAG,"Car -> drive()")
    }

    companion object {
        private const val TAG: String = "Car"
    }

}