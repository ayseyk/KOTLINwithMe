package Collections

fun main(args: Array <String>){
    /*var myArray = Array<Int>(3) {0}
    for(i in myArray) println(i)
    println("--------------------------")

    var myArray2 = arrayOf("Kotlin","Java","Javascript")
    for(i in myArray2) println(i)
    println("--------------------------")

    for(i in 0..myArray2.size-1) println(myArray2[i])
    println("--------------------------")

    var array= arrayOf<String> ("ayse","seyma","feyza")
    (array.size-1 downTo 0).forEach{i -> println(array[i])}*/

    var list = listOf<Int>(1,2,3)
    //list[0]=61   değiştirilemez--immutable
    println(list)
    println("--------------------------")

    var list2 = mutableListOf<Int>(3,5,9) //arrayListOf benzer kullanım!
    list2[0]=61   //değiştirilebilir-mutable
    println(list2)
    println("--------------------------")

    var list3 = ArrayList<String>()
    list3.add("ayse")   //eleman ataması bu şekilde yapılabiliyor.
    println(list3)

    val name : String = "Ayşe"
    val age : Int =22
    val number : Int =5
    println("Merhaba "+name)
    println(age.toString() + " --> Senin yaşın ")
    println("Senin yaşın : "+age)
    println("5"+number)
}