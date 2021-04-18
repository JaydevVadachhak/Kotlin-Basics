package oopConcepts.inheritance

//open keyword used for to define parent class
//parent class
open class Animals(var legs: Int, var color: String) {
    fun eat(){
        println("i eat")
    }

    fun sleep(){
        println("i sleep")
    }

    //parent method - can be override in other classes
    open fun run(){
        println("i run")
    }
}