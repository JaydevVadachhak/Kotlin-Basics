package oopConcepts.inheritance

//child class 1
class Dogs(legs: Int, color: String): Animals(legs, color) {

    fun bark(){
        println("I bark")
    }

    override fun run(){
        println("we dogs have fastest speed")
    }
}