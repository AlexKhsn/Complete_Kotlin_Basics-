package numbersAndVariableTypes

import kotlin.math.abs

//  Task 1

/*
fun main(args: Array<String>) {
    val byteNum: Byte = 100
    val shortNum: Short = 30000
    val intNum: Int = 2000000000
    val longNum: Long = 5000000000L

    println("$byteNum - ${byteNum::class.java}")
    println("$shortNum - ${shortNum::class.java}")
    println("$intNum - ${intNum::class.java}")
    println("$longNum - ${longNum::class.java}")

    val result: Long = byteNum + shortNum + intNum + longNum
    println("$result - ${result::class.java}")
}
 */

//  Task 2

/*
fun main(args: Array<String>) {
    val floatNum: Float = 3.14f
    val doubleNum: Double = 2.718281828
    println("$floatNum - ${floatNum::class.java}")
    println("$doubleNum - ${doubleNum::class.java}")
    val floatToDouble = floatNum.toDouble()
    val doubleToInt = doubleNum.toInt()
    println("float number -> double number = $floatToDouble - ${floatToDouble::class.java}")
    println("Double number -> integer = $doubleToInt - ${doubleToInt::class.java}")
}
 */

//  Task 3

/*
fun main(Args : Array<String>) {
    println("Введи первое число: ")
    val num1 = (readLine()?:"0").toInt()
    println("Введи второе число: ")
    val num2 = (readLine()?:"0").toDouble()
    println("Введи третье число: ")
    val num3 = (readLine()?:"0").toFloat()

    val average = (num1 + num2 + num3) / 3.0

    println("$num1 - ${num1::class.java}")
    println("$num2 - ${num2::class.java}")
    println("$num3 - ${num3::class.java}")
    println("Среднее значение - $average - ${average::class.java}")
}
 */

//  Task 4

/*
fun main(args: Array<String>) {
    println("Введи кол-во байт: ")
    val byteNum = (readLine()?:"0").toLong()
    val kilobytes: Double = (byteNum / 1024).toInt().toDouble()
    val megabytes: Float = (byteNum / 1024.0.pow(2)).toInt().toFloat()
    val gigabytes: Double = (byteNum / 1024.0.pow(3)).toInt().toDouble()

    println("$byteNum байт")
    println("kilobytes: $kilobytes - ${kilobytes::class.java}")
    println("megabytes: $megabytes - ${megabytes::class.java}")
    println("gigabytes: $gigabytes - ${gigabytes::class.java}")
}
 */

//  Task 5

fun main(Args: Array<String>) {
    println("Введи число с точкой: ")
    val userNumber = (readLine() ?: "0").toDouble()
    val fullNum = userNumber.toInt()
    val fractNum = ((userNumber % 1) * 1000).toLong()
    val absNum = abs(userNumber).toFloat()

    println("$userNumber - ${userNumber::class.java}")
    println("$fullNum - ${fullNum::class.java}")
    println("$fractNum - ${fractNum::class.java}")
    println("$absNum - ${absNum::class.java}")
}
