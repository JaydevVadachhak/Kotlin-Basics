package oopConcepts.dataClasses

fun main(){
    val res1 = Restaurants("Restaurant 1", 5.6, 400)

    val res2 = Restaurants("Res 2", 4.8, 500)

    val res3 = Restaurants("Res 3", 9.6, 700)

    val resList = mutableListOf(res1, res2, res3)

    for (i in resList){
        println(i)
    }
}