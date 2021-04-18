package oopConcepts.constructor.primaryandSecondary

class Dog(var breed: String, var color: String){

    var name: String? = null

    constructor(breed: String, color: String, name: String): this(breed, color){
        this.name = name
    }
}