package oopConcepts.inheritance

fun main(){
    val dog = Dogs(2, "black")
    dog.bark()
    dog.eat()
    dog.run()

    val cat = Cats(4, "brown")
    cat.purr()
    cat.sleep()
    cat.run()
}