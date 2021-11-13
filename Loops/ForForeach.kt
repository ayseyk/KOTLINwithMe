package Loops

    //10.downTo 1 step 2

fun main(args: Array<String>){
    //for(i in 1..5) println("Kotlin")
    //for(i in 1.rangeTo(10)) println(i)
    for (i in 5 downTo 1 step 2) print("$i ")
    println("")

    (5 downTo 1 step 2).forEach{i -> print("$i ")  }
    println("")

    disDongu@ for (i in 1..3){
        icDongu@ for (j in 1..5){
            println("i = $i; j = $j")
            if(i==2) break@disDongu
        }
    }


}