package operators

fun main(){
    val a = 3

    if(!(a > 0 && a <= 5)){
        println("between o and 5")
    }else{
        println("not between 0 and 5")
    }
}

/*
    Logical or -> ||
    Logical and -> &&
    Logical not -> !

    in operator -> ..
    if(a in 1..5)
 */