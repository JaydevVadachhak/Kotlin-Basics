package conditionalStatements

fun main(){
    val num = 2

    when(num){
        0 -> println("zero")
        1 -> println("one")
        2 -> println("Two")
        else -> println("None of the above")
    }

    val num1 = 0

    when{
        num1 > 0 -> println("greater zero")
        num1 < 0 -> println("less than zero")
        else -> println("Both equal")
    }
}

/*
    when(condition){
        case1 -> operation1
        case2 -> operation2
        .
        .
        .
        else -> operation
    }
 */

/*
    when{
        case1 -> operation1
        case2 -> operation2
        .
        .
        .
        else -> operation
    }
 */