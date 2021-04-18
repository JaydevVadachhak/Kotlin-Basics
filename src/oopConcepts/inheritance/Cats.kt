package oopConcepts.inheritance

//child class 2
class Cats(legs: Int, color: String): Animals(legs, color) {
    fun purr(){
        println("i purr")
    }

    override fun run(){
        println("we cats are not that fast as dogs")
    }
}