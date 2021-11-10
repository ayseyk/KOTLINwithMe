package helloWorld

fun main(args: Array<String>) {
    println("Hello, world!")
    val name="ayşe"

    var number:Float= 1.1458F
    //var num: Float= 15.544   Float değişkeni tanımlayabilmek için sonuna 'F' karakteri eklenmelidir.

    var something:String?="ayse"
    println(something?.length)

    var a:Int?=5 //null atayabilmek için ?'i kullanılır.
    a=null
    println(a)
    //null rulo veya peçete yok ama 0 da peçetesi bitmiş rulo var, yani temeli kalıbı belli.

    var x= something!!.length
    println(x)

    var number1:Int =1548
    var max= if(number1>number) number1 else number
    println(max)

    when(number1){
        1548-> println("Value of the number1 is $number1")
        else -> println("Wrong number!")
    }

    when(number1){
        in 1 .. 1548-> println("Value of the number1 is $number1")
        else -> println("Wrong number!")
    }
}