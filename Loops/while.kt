package Loops

fun main(args: Array<String>) {
    var name: String
    var password: String
    /*do{
        print("Enter your name: ")
        name= readLine().toString()
        print("Enter your password: ")
        password= readLine().toString()
     }while(name!="ayşe"&& password!="123")
     println("Successfull Login")
    ---------------------
    print("Enter your name: ")
    var myName = readLine()
    println("My name is $myName")

    var number:Int
    for(i in 1..10){
        if(i%2==0) continue
        println(i)
    }

    print("Enter a number: ")
    number = readLine()!!.toInt()
    print("\n Your number is $number")*/

    var number: Int
    println("Enter a number: ")
    number = readLine()!!.toInt()
    var sayi:Int=0

    var isAsal:Boolean= true

   /* for(i in 2..number){
        if(number==1 || number==2) break
        for(j in 2..i){
            if(i%j==0 || i%j==1) isAsal=false

        }

        if (isAsal) println("$i asaldır.")

    }*/


    for (i in 2..number){
        if(number==i) break
        if(number%i ==0) isAsal=false
        if(isAsal) {
            println("$number asaldır")
            break
        }else {
            println("$number asal değildir")
            break
        }
    }
}








