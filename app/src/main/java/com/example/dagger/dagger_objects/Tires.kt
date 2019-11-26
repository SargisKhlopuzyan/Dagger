package com.example.dagger.dagger_objects

import android.util.Log

/**
 * Created by FastShift, Inc., on 11/26/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */
class Tires
/**@Inject*/ constructor() {

    fun inflate() {
        Log.e(TAG, "Tires inflated")
    }

    companion object {
        private const val TAG: String = "Car"
    }

}