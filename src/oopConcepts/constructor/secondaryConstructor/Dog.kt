package oopConcepts.constructor.secondaryConstructor

class Dog {

    var breed: String = ""
    var color: String = ""
    var age: Int = 0

    constructor(breed: String, color: String, age: Int){
        this.breed = breed
        this.color = color
        this.age = age
    }
}