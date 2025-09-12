package handlingExceptions

/**
fun main() {
 println("Что ты хочешь купить?")
 val product: String? = readLine()
 println("Сколько $product ты хочешь купить?")
 try {
 val numberOfProducts: Int? = readLine()?.toInt()

 if (numberOfProducts !== null) {
 println("Ты хочешь купить $numberOfProducts $product на сумму ${numberOfProducts * 9.99}$")
 } else {
 throw Exception("Неверное кол-во!")
 }
 } catch(e: Exception) {
 println("Возникла ошибка: \n${e.localizedMessage}")
 e.printStackTrace()
 }

}
*/

fun main() {
    println("Что ты хочешь купить?")
    val input1 = readLine()
    println("Сколько ты хочешь?")
    val input2 = readLine()
    val price = 9.99

    try {
        val amount: Int? = input2?.toInt()
        println("$amount $input1 стоит: ${amount?.times(price)}")
    } catch (e: Exception) {
        println("Возникла ошибка: \n${e.localizedMessage}")
        e.printStackTrace()
    } finally {
        println("Возвращайся снова")
    }
}
