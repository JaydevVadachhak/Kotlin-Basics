package lists

//Mutable List: Not Fixed size and Not Fixed values
//var/val lisName = mutableListOf<datatype>(list_of_items)

fun main(){
    var list = mutableListOf<Any>("1",2,3.5f,'c')

    list[1] = "Jay"
    //we can do this because of type mutable

    list.add(4, "Hi im added")
    //list.add(value) //this also possible

    list.removeAt(2)
    //list.remove(value) //this also possible

    println(list)
}