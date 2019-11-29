package com.example.dagger

import android.app.Application
import com.example.dagger.dagger.component.AppComponent
import com.example.dagger.dagger.component.DaggerAppComponent
import com.example.dagger.dagger.module.DriverModule

/**
 * Created by FastShift, Inc., on 11/28/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */
class ExampleApp : Application() {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

//        appComponent = DaggerAppComponent.create()
        appComponent = DaggerAppComponent.factory().create(DriverModule("Sargis"))
    }

    fun getAppComponent(): AppComponent {
        return appComponent
    }
}