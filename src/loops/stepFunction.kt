package loops

fun main(){

    //increment by 2 in for using step
    for (i in 1..10 step 2){
        println(i)
    }

    //increment by 2 in while and do while
    var i = 1
    while (i <= 10){
        println(i)
        i+=2
    }
}