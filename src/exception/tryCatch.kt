package exception

fun main(){
    var arr = arrayOf(1,2,3,5)

    try {
        arr[4] = 7 //exception occurs here
        println("I try block run")
    }catch (e: ArrayIndexOutOfBoundsException){
        println("I catch run and caught exception of try")
    }finally {
        println(arr[2])
    }
}