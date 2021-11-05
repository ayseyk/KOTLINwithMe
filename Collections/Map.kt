package Collections

fun main(args: Array <String>){
    var map = mapOf<String,Int>("Ayşe" to 99,"Salih" to 72)
    for(i in map.keys) println("$i -->key  $map")
    println("--------------------------")

    var map2 = HashMap<String,Int>()
    map2.put("ayşe",61) //HashMap yapısına eleman bu şekilde eklenir.
    map2.put("şeyma",3)
    println(map2)
    println("--------------------------")
    map2.replace("ayşe",99)
    println(map2)
    println("--------------------------")

    var set = mutableSetOf<Int>(1,2,55,55,55,4,7,8,1,2)//unique
    println(set.size)

    /*
    ----------ARRAY-------
    Array<....>(eleman sayisi){hepsine atanacak deger}
    arrayOf(..values..)

    --------LIST----------
    listOf ---> <...>(values)
    ArrayList,arrayListOf, mutableListOf ---> <...>(values)
       |--> <...>(), add ile eleman eklenir.

    ---------MAP------- key and values
    mapOf ---> <...,...>(key to values,....)
    HashMap, hashMapOf, mutableMapOf ---> <...,...>(key to values,....)
       |--> <...,...>(), put ile eleman eklenir.

    --------SET------ unique
    setOf ---> <...>(values)
    mutableSetOf, hashSetOf ---> <...>(values)
    */
}