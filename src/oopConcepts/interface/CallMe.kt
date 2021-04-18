package oopConcepts.`interface`

class CallMe: MyInterface, MySecondInterface {
    override fun hello() {
        println("hello from call me")
    }

    override fun greeting() {
        println("hi from call me")
    }

    override fun method(){
        println("method from call me")
    }
}