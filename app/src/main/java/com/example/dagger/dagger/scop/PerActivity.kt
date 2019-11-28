package com.example.dagger.dagger.scop

import java.lang.annotation.Documented
import javax.inject.Scope

import kotlin.annotation.AnnotationRetention.RUNTIME

/**
 * Created by FastShift, Inc., on 11/28/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */
@Scope
@Documented
@Retention(RUNTIME)
annotation class PerActivity {
}