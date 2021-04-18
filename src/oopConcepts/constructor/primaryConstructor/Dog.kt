package oopConcepts.constructor.primaryConstructor

//method: 1 - initialization
//class Dog constructor(breed: String, color: String, age: Int) {}

//method: 2
class Dog(var breed: String, var color: String, var age: Int){
    fun eat(){
        println("${breed}'s eat")
    }

    fun bark(){
        println("${breed}'s bark")
    }
}