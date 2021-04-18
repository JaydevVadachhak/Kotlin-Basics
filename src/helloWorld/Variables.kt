package helloWorld

fun main(){
    //Note 1: Var - mutable - can change data after initialization
    var x = 10 //Int
    var y = "Hello" //string
    var z = 3.4 //double
    var w = 4.78f //float
    var boo = true //boolean

    //Note 2: Val - Immutable - can't change after initialization
    val a = 10
    val b = "Hello in val"
    val c= 2.4
    val d = 2.6f //float
    val g = 'j' //character

    //method 2: for initialization
    var integerVar: Int = 10 // varName: Datatype = value
    val doubleVar: Double //declared without values

    x = 20 //we can do this
    //a = 25 //we can't do this

    //Statically typed language
    //y = 2.4 //we can also not able to change type of data

    //type inference
    //automatically detect type of data

    println(x)
    println(d)
}