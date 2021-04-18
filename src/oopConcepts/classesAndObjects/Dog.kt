package oopConcepts.classesAndObjects

//class - first letter of class name should be uppercase
class Dog {
    var breed: String = "Labrador"
    var color: String = "Black"
    var age: Int = 3

    fun eat(){
        println("${breed}'s eat food'")
    }

    fun bark(){
        println("${breed}'s bark")
    }

}