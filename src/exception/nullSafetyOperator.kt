package exception

fun main(){
    val string: String? = null
    // '?' called null safety operator
    //used for those variables whose value may be null
    // string.length is wrong for this type of variables, instead we write string?.length
    println(string?.length)
//    println(string!!.length) //we can also use non asserted calls

    //to see difference between ? and !! try to uncomment and comment one by one and see the output
}