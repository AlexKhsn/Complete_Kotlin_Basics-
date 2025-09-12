package handlingExceptions

fun main() {
    try {
        println("Введи свой возраст: ")
        val age: Int? = readLine()?.toIntOrNull()
        if (age == null) throw IllegalArgumentException("Неправильно ввел возраст!")
        println("Твой возраст: $age")
    } catch (e: Exception) {
        println(e.localizedMessage)
        println("Попробуй заново")
    } finally {
        println("Возвращайся еще раз!")
    }
}
