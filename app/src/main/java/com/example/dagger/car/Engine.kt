package com.example.dagger.car

/**
 * Created by FastShift, Inc., on 11/26/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */
interface Engine /**@Inject constructor(block: Block, cylinders: Cylinders, sparkPlugs: SparkPlugs)*/ {

    //(block: Block, cylinders: Cylinders, sparkPlugs: SparkPlugs)
//    @Inject
//    constructor() {
//    }

    fun start()

}