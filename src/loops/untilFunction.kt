package loops

fun main(){
    val a = arrayOf("j","a","y")

    for (i in 0 until a.size){ //i in 0..(a.size-1)
        println("${a[i]}")
    }
}