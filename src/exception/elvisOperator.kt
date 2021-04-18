package exception

fun main(){
    val string: String? = null
    // '?:' called Elvis operator
    //used for print some custom messages
    println(string?.length ?: "This is null")

}