package com.wayne.kotlin.box

import com.wayne.box.Box
import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)

    val box3 = Box(23f,14f,13)
    val box5 = Box(39.5f,27.5f,23)

    print( "Please enter object's length (Enter -1 to quit): " )

    var length = scanner.nextFloat()

    while ( length != -1f ){

        print("Please enter object's width: ")

        var width = scanner.nextFloat()

        print("Please enter object's height:")

        var height = scanner.nextFloat()

        if ( box3.validate(length, width, height.toInt()) )

            println("Box3")

        else if (box5.validate( length, width, height.toInt() ) )

            println("Box5")

        else println("No box can use!")

        println()

        print("Please enter object's length (Enter -1 to quit): ")

        length = scanner.nextFloat()
    }



}

class Box(val length:Float, val width:Float, val height:Int ){

    fun validate ( length: Float, width: Float, height: Int): Boolean {

        val nums = floatArrayOf( length, width, height.toFloat() )

        Arrays.sort(nums)

        if ( length > nums[2] )

            return false

        else if ( width > nums[1] )

            return false

        else return height <= nums[0]

    }


}
