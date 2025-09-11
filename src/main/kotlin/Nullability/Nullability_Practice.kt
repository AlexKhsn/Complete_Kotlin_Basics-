package org.example.Nullability

import kotlin.random.Random

//  Task 1
/*
fun main(Args : Array<String>) {
    println("Как тебя зовут?")

    val userName: String? = readLine()

    val nameLength = userName?.length
    val upperName = userName?.uppercase()
    val firstChar = userName?.firstOrNull()

    println("Длинна имени: ${nameLength ?: 0}")
    println("Имя в верхнем регистре: ${upperName ?: "АНОНИМ"}")
    println("Первая буква имени: ${firstChar ?: "..."}")

    val displayName = userName?:"Аноним"

    println("Добро пожаловать, $displayName!")
}
 */


//  Task 2

/*
fun main(Args : Array<String>) {
    println("Введи первое число: ")
    val num1: Int? = readLine()?.toIntOrNull()

    println("Введи второе число: ")
    val num2: Int? = readLine()?.toIntOrNull()




    val sum: Int? = if (num1 != null && num2 != null) {
        num1 + num2
    } else {
        null
    }

    val times: Int? = if (num1 != null && num2 != null) {
        num1 * num2
    } else {
        null
    }

    val div: Double? = if (num1 != null && num2 != null && num2 != 0) {
        num1.toDouble() / num2
    } else {
        null
    }


    println("Сумма: ${sum ?: "Невозможно вычислить!"}")
    println("Произведение: ${times ?: "Невозможно вычислить!"}")
    println("Деление: ${div ?: "Невозможно вычислить!"}")

    var completedOperations = 0

    if (sum != null) completedOperations++
    if (times != null) completedOperations++
    if (div != null) completedOperations++

    println("Выполнено операций: $completedOperations из 3")
}
 */


//  Task 3

/*
fun main(Args : Array<String>) {
    println("Введи возраст: ")
    val age: Int? = readLine()?.toIntOrNull()
    val validAge = age ?: 0

    println("Введенный возраст: $age}")
    println("Возраст для обработки: $validAge")

    val category = when(validAge) {
        0 -> "Возраст неизвестен"
        in 1..17 -> "Несовершеннолетний"
        else -> "Взрослый"
    }

    println("Возраст: $age, Возраст для обработки: $validAge, Категория: $category")
}
*/

//  Task 4

/*
fun main(Args : Array<String>) {
    println("Введи любой текст: ")
    val userText: String? = readLine()
    val textLength = userText?.length
    val firstChar = userText?.firstOrNull()
    val lastChar = userText?.lastOrNull()

    val lengthLabel = "Длина"!!

    println("$lengthLabel: ${textLength ?: "Неизвестно"}")
    println("Первый символ: ${firstChar ?: "Отсутствует"}")
    println("Последний символ: ${lastChar ?: "Отсутствует"}")
}
 */


//  Task 5


/*
fun main(Args : Array<String>) {
    println("Введи первое число: ")
    val num1: Double? = readLine()?.toDoubleOrNull()

    println("Введи второе число: ")
    val num2: Double? = readLine()?.toDoubleOrNull()

    val average = if (num1 != null && num2 != null) {
        (num1 + num2) / 2
    } else {
        null
    }

    val sqrDiv = if (num1 != null && num2 != null) {
        Math.pow(num1,2.0) - Math.pow(num2,2.0)
    } else {
        null
    }

    println("Среднее значение: ${average ?: "Неизвестно"}")
    println("Разность квадратов: ${sqrDiv ?: "Неизвестно"}")

    val finalMsg = "Анализ завершен!"!!

    println(finalMsg)
}
 */


/*
fun main(Args : Array<String>) {
    val message: String? = null
    val number: Int? = 42
    val isNull = when (message) {
        null -> true
        else -> false
    }

    println("Сообщение: $message")
    println("Число: $number")

    println("message - это null: $isNull")


}
 */


/*
fun main(args: Array<String>) {
    val userName: String? = null
    var userAge: Int? = 30
    val isActive: Boolean? = true


    println(userName)
    println(userAge)
    println(isActive)

    println()

    println("userName равно null: ${userName == null}")
    println("userAge равно null: ${userAge == null}")
    println("isActive равно null: ${isActive == null}")

    userAge = null

    println()
    println(userAge)
    println("userAge равно null: ${userAge == null}")
}
 */



/*
fun main(args: Array<String>) {
    val text: String? = "Hello World"
    val emptyText: String? = null
    val textLength = text?.length
    val emptyLength = emptyText?.length
    val firstChar = text?.firstOrNull()
    val upperText = text?.uppercase()

    println(text)
    println(emptyText)
    println(textLength)
    println(emptyLength)
    println(firstChar)
    println(upperText)

    // Если не использовать safe call "?." то при попытке получить значение свойства length у null возникнет ошибка
}
 */

/*
fun main(args: Array<String>) {
    val a: Int? = 10
    val b: Int? = null
    val c: Int? = 5

    var sum: Int? = null
    var subtraction: Int? = null
    var mult: Int? = null

    if (a != null && c != null) {
        sum = a + c
        subtraction = a - c
    }

    if (a != null && b != null) {
        mult = a * b
    }

    println("$a + $c = $sum")
    println("$a - $c = $subtraction")
    println("$a * $b = $mult")
}
 */

/*
fun main(args: Array<String>) {
    val name: String? = null
    val age: Int? = null
    val city: String? = "Gliwice"

    val finalName = name ?: "Аноним"
    val finalAge = age ?: 18
    val finalCity = city ?: "Неизвестно"

    println("Исходное имя: $name, Финальное: $finalName")
    println("Исходный возраст: $age, Финальный: $finalAge")
    println("Исходный город: $city, Финальный: $finalCity")
}
 */


/*
fun main(args: Array<String>) {
    val text: String? = "Hello"
    val number: Int? = 42
    val nullValue: String? = null
    
    val definiteText = text!!
    val definiteNumber = number!!
    
    println("definite text: $definiteText (тип: ${definiteText::class.java})")
    println("definite number: $definiteNumber (тип: ${definiteNumber::class.java})")
    
    // Если использовать оператор "!!" и получить значение definiteNullValue, то при попытке получить класс переменной возникнет ошибка
}
 */

/*
fun main(args: Array<String>) {
    val a: Int? = 20
    val b: Int? = null
    val c: Int? = 4
    val regularNum: Int = 5

    println("$a + $regularNum = ${a?.plus(regularNum)}")
    println("$a - $regularNum = ${a?.minus(regularNum)}")
    println("$b * $regularNum = ${b?.times(regularNum)}")

    println()

    println("$a + $c = ${if(a != null && c != null) {a + c} else {null}}")
    println("$a * $b = ${if (a != null && b != null) {a * b} else {null}}")

    println()

    println("$a + $c = ${a?.plus(c?:0)}")
    println("$a * $b = ${a?.times(b?:0)}")
}
 */


fun main(args: Array<String>) {
    println("Введи имя: ")
    var userName: String? = readLine()
    if (userName == "") null
    userName = userName ?: "Аноним"

    println("Введи возраст: ")
    val userAge: Int? = readLine()?.toIntOrNull()

    println("Введи зарплату: ")
    val salary: Double? = readLine()?.toDoubleOrNull()

    val nameLength = userName?.length
    val ageCategory = when(userAge) {
        0 -> "Неизвестный"
        in 1..18 -> "Несовершеннолетний"
        else -> "Взрослый"
    }

    val monthlyTax = salary?.times(0.13)
//    val yearsToRetritment = 65 -
}