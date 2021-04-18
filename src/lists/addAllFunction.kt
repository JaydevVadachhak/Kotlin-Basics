package lists

fun main(){
    val arr = arrayOf("1","2",3)
    val list = mutableListOf<Any>("1",2,"3",3.5)

    list.addAll(arr) //combination of array+list

    println(list)
}