package conditionalStatements

//Block Body Function
fun checkGreater(a:Int, b:Int): Unit{
    if (a>b){
        println("a is greater than b")
    }else if (a<b){
        println("b is greater than a")
    }else{
        println("Both are Equal")
    }
}

//Expression body function
fun maxValue(a: Int, b: Int): Int = if (a > b){
    a
}else{
    b
}

fun main(){
    checkGreater(10, 20)
    println(maxValue(20, 10))
}