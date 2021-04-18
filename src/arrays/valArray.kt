package arrays

import java.util.*

fun main(){

    val array = arrayOf('s',1,5,30.5f, "Hello")

    //Note: in val array, we can not change length of array - if do, got arrayindexoutofbounds exception
    //Note: in val array, we can change each elements one by one but not whole array

    //Array<Any> : any type of data types you can include inside array
    //Array<Datatype>

    println(array.get(2))

    //how to print whole array
    println(Arrays.toString(array))
}