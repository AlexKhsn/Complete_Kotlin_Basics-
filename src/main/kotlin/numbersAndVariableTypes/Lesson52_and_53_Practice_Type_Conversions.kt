package numbersAndVariableTypes

fun main(args: Array<String>) {
    println("Give a number: ")
    val userNumber = (readLine() ?: "")
    val numByte = userNumber.toByte()
    val numShort = userNumber.toShort()
    val numInt = userNumber.toInt()
    val numLong = userNumber.toLong()
    val numFloat = userNumber.toFloat()
    val numDouble = userNumber.toDouble()

    println(numByte::class.java)
    println(numShort::class.java)
    println(numInt::class.java)
    println(numLong::class.java)
    println(numFloat::class.java)
    println(numDouble::class.java)

    println()

    val pi = 3.14159
    println(pi::class.java)
    val piFloat = pi.toFloat()
    println(piFloat)
    println(piFloat::class.java)

    val piInt = piFloat.toInt()
    println(piInt)
    println(piInt::class.java)

    val piString = pi.toString()
    println(piString)
    println(piString::class.java)
}
