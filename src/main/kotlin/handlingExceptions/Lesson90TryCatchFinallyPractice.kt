package handlingExceptions

/**
fun main() {
 try {
 println("Введи число: ")
 val number: Int? = readLine()?.toIntOrNull()
 if (number == null) throw Exception("Это не число!")
 println("$number * 5 = ${number * 5}")
 } catch(e: Exception) {
 println("Возникла ошибка: \n${e.localizedMessage}")
 e.printStackTrace()
 }
}
 */

/**
fun main() {
 println("Сколько ты пробежал?")

 try {
 val km: Int? = readLine()?.toIntOrNull()
 if (km != null) {
 println("$km km = ${km * 0.62} miles")
 } else {
 throw Exception("Это не число!")
 }
 } catch(e: Exception) {
 println("Возникла ошибка \n${e.localizedMessage}")
 e.printStackTrace()
 }
}
*/

fun main() {
    println("Сколько ты пробежал?")
    val inputDistance = readLine()

    try {
        val distance = inputDistance?.toDouble()
        println("$distance km = ${distance?.times(0.62)} miles")
    } catch (e: Exception) {
        println("Возникла ошибка: \n${e.localizedMessage}")
        e.printStackTrace()
    }
}
