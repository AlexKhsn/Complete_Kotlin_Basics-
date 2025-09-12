package handlingExceptions

fun main() {
    try {
        println()
        println("'Try' block starts")
        println("Введи число: ")
        val number = readLine()?.toInt()
        println("Введенное число: $number")
        println("'Try' block ends")
        println()
    } catch (e: Exception) {
        println()
        println("'Catch' block starts")
        println("Something's wrong \n${e.localizedMessage}")
        e.printStackTrace()
        println("'Catch' block ends")
        println()
    } finally {
        println()
        println("Message from 'finally block - will be shown always'")
    }
}
