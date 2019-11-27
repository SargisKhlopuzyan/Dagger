package com.example.dagger.car

import android.util.Log
import javax.inject.Inject

/**
 * Created by FastShift, Inc., on 11/26/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */
class Remote @Inject constructor(){

//    @Inject
//    constructor() {
//    }

    fun setListener(car: Car) {
        Log.e(TAG, "Remote connected")
    }

    companion object {
        private const val TAG: String = "Car"
    }

}