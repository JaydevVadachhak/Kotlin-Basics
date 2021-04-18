package lists

//Immutable List: Fixed size and values
//var/val lisName = listOf<datatype>(list_of_items)

fun main(){
    var list = listOf<Any>("1",2,3.5f,'c')

    // list[1] = "Jay"
    //we can't do this because of type immutable

    println(list)
}