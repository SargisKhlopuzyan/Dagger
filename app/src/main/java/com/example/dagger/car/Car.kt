package com.example.dagger.car

import android.util.Log
import com.example.dagger.dagger.scop.PerActivity
import javax.inject.Inject

/**
 * Created by FastShift, Inc., on 11/26/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */
@PerActivity
class Car {

    var driver: Driver
    var wheels: Wheels

    @Inject
    lateinit var engine: Engine

    @Inject
    constructor(driver: Driver, wheels: Wheels) {
        this.driver = driver
        this.wheels = wheels
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    fun drive() {
        engine.start()
        Log.e(TAG, "$driver drives $this")
    }

    companion object {
        private const val TAG: String = "Car"
    }

}