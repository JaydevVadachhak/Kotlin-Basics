package oopConcepts.constructor.primaryConstructor

import oopConcepts.constructor.primaryConstructor.Dog

fun main(){
    val dog1 = Dog("Labrador", "Brown", 10)
    dog1.bark()
    dog1.eat()

    val dog2 = Dog("German Shepherd", "Black", 11)
    dog2.eat()
}