package exception

fun main(){
    var arrList = arrayListOf(1,2,null,3,null,4,null,10)

    println(arrList.filterNotNull())
}