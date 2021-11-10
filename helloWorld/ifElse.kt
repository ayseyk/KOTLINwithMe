fun main(args: Array<String>) {
/*  var value: Int = 61
    var value2: Int = 61

    if (value == value2)
        //println("$value reference is correct") //string metni içinde değişken kullanımı!
        //println(value.toString() + " reference is correct")
        println("trabzon"+(value)) //string ifadeden sonra + ile farklı tip dönüştürülmeden direkt yazılabilir.

    else
        println("reference is not correct")
*/
    var point:Int=55
    val result= if(point==100){
        "congratulations"
    }else if(point>=50){
        "it's enough"
    }else
        print("you failed!")
    println(result)

    if (point in 50..100) println("good") else println("soryy, but you failed")

    val point2:Int= 78
    val result2 = when(point2){
        in 50..69 -> "nice, you passed!"
        in 70 .. 100 -> "very good"

        else -> "you failed"
    }
    println(result2 + " your point is $point2")
    println(result2 + " your point is " + point2.toString())
}