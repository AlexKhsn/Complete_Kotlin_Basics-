package handlingExceptions

//  Безопасный калькулятор

/*
fun main() {
 println("Введи первое число: ")
 val num1: Double? = readLine()?.toDoubleOrNull()
 println("Введи второе число: ")
 val num2: Double? = readLine()?.toDoubleOrNull()

 try {
 if (num1 != null && num2 != null && num2 != 0.0) {
 println("$num1 / $num2 = ${num1 / num2}")
 } else if (num2 == 0.0) {
 throw Exception("На ноль делить нельзя!")
 } else {
 throw Exception("Ошибка введенных данных!")
 }
 } catch(e: Exception) {
 println("Возникла ошибка: \n${e.localizedMessage}")
 e.printStackTrace()
 }
}
*/

//  Анализатор возраста

/*
fun main() {
 println("Введи возраст: ")
 val inputAge = readLine()

 try {
 val age = inputAge?.toInt()
 if (age != null && age < 0) {
 throw Exception("Возраст не может быть отрицательным!")
 } else if (age != null && age > 150) {
 throw Exception("Нереальный возраст!")
 }
 val ageCategory = when(age) {
 in 0..12 -> "Ребенок"
 in 13..17 -> "Подросток"
 in 18..59 -> "Взрослый"
 else -> "Пожилой"
 }

 println("Введенный возраст - $age соответствует категории $ageCategory")
 } catch(e: Exception) {
 println("Возникла ошибка: \n${e.localizedMessage}")
 e.printStackTrace()
 } finally {
 println("Анализ завершён")
 }
}

*/

//  Обработчик строки

/*
fun main() {
 println("Введи любой текст: ")
 val inputText = readLine()
 println("Введи позицию символа (число): ")
 val inputPosition = readLine()
 val textLength = inputText?.length

 try {
 val position = inputPosition?.toIntOrNull()

 if (textLength == null || position == null) throw Exception("Введены неверные данные!")

 if (position >= 0 && position <= textLength) {
 val char = inputText[position - 1]
 println("В строке '$inputText' на позиции '$position' находится символ '$char'")
 } else {
 throw Exception("Выход за границы строки")
 }
 } catch(e: Exception) {
 println("Возникла ошибка: \n${e.localizedMessage}")
 e.printStackTrace()
 } finally {
 println("Длина исходной строки: $textLength символов")
 }
}
*/

//  Проверка пароля

/*
fun main() {
 println("Введи пароль: ")
 val inputPassword = readLine()

 try {
 if (inputPassword == null) throw Exception("Ошибка ввода!")
 if (inputPassword.length < 6) throw Exception("Длина пароля должна быть минимум 6 символов")
 if (inputPassword == "123456" || inputPassword == "password") throw Exception("Пароль не должен быть равен \"123456\" или \"password\"")

 println("Пароль принят")
 } catch(e: Exception) {
 println("Возникла ошибка: \n${e.localizedMessage}")
 e.printStackTrace()
 } finally {
 println("Проверка пароля завершена")
 }
}
*/

//  Банковский перевод

fun main() {
    println("Введи текущий баланс: ")
    val inputBal = readLine()?.toDoubleOrNull()
    println("Введи сумму перевода: ")
    val transAmount = readLine()?.toDoubleOrNull()

    try {
        if (inputBal == null || transAmount == null) throw Exception("Введены неверные данные!")
        if (inputBal < 0) throw Exception("Баланс не может быть отрицательным")
        if (transAmount <= 0) throw Exception("Сумма перевода должна быть больше 0")
        if (transAmount > inputBal) throw Exception("Сумма перевода не может превышать баланс")

        println("Перевод совершен! Баланс после перевода: ${inputBal - transAmount}$")
    } catch (e: Exception) {
        println("Возникла ошибка: \n${e.localizedMessage}")
        e.printStackTrace()
    } finally {
        println("Операция завершена")
    }
}
