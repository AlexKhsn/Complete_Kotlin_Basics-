package org.example.Operators_And_Booleans

fun main(args: Array<String>){
    val a = 12
    val b = a
    println("a = $a - ${a::class.java}")                    // ASSIGNMENT (ПРИСВОЕНИЕ)
    println("b = a = $b - ${b::class.java}")

//    val x = 12
//    val y: Char = x                                       //  ТИПЫ ДАННЫХ ПЕРЕМЕННЫХ ДОЛЖНЫ БЫТЬ ОДИНАКОВЫ, ИНАЧЕ БУДЕТ ОШИБКА
//    println(y)

    println()

    val name = "Alex"
    val greeting = "Hello, $name!"                          //  REFERENCE
    println(greeting)


    println()


    val products = 3
    val price = 3.99                                        //  REFERENCE EXPRESSION
    println("Your total price is: ${products * price}$")
}