package org.example.User_input

import kotlin.random.Random

// Task 1

/*


fun main(Args : Array<String>) {
    println("Введи имя: ")
    val userName = readLine()

    println("Введи возраст: ")
    val userAge = (readLine()?:"").toInt()

    val ramdomNumber = Random.nextInt(1, 101)

    println("Привет, $userName! Через $ramdomNumber лет тебе будет ${userAge + ramdomNumber} лет")
}

 */

//  Task 2

/*

fun main(Args : Array<String>) {
    val randomNumber = Random.nextInt(1, 11)
    println("Угадай число от 1 до 10")
    val userNumber = (readLine()?:"").toInt()

    if(userNumber == randomNumber) {
        println("Поздравляю! Ты угадал!")
    } else {
        println("Не угадал. Загаданное число было $randomNumber.")
    }

    println("Разность составляет : ${randomNumber - userNumber}")
}

 */


//  Task 3

/*

fun main(args: Array<String>) {
    println("Введи первое число: ")
    val firstNumber = (readLine()?:"").toDouble()
    println("Введи второе число: ")
    val secondNumber = (readLine()?:"").toDouble()
    val randomNumber = Random.nextInt(1, 5)
    var result: Double = 0.0
    var operation: Char = ' '

    when(randomNumber) {
        1 -> {
            result = firstNumber + secondNumber
            operation = '+'
        }
        2 -> {
            result = firstNumber - secondNumber
            operation = '-'
        }
        3 -> {
            result = firstNumber * secondNumber
            operation = '*'
        }
        4 -> {
            result = firstNumber / secondNumber
            operation = '/'
        }
    }

    println("$firstNumber $operation $secondNumber = $result")
}


 */



//  Task 4

/*

fun main(Args : Array<String>) {
    println("Введи температуру в °C")
    val userTemp = (readLine()?:"").toDouble()
    val randomNumber = Random.nextInt(1, 4)
    var converted: Double = 0.0
    var tenpUnit: Char = 'C'

    when (randomNumber) {
        1 -> {
            converted = userTemp * 9.0 / 5 + 32
            tenpUnit = 'F'
        }
        2 -> {
            converted = userTemp + 273.15
            tenpUnit = 'K'
        }
        3 -> converted = userTemp
    }

    println("$userTemp°C = $converted°$tenpUnit")
}


 */



//   Task 5

fun main(Args : Array<String>) {
    println("Задай мне вопрос: ")
    val userQuestion: String = readLine()?:""
    val randomNumber = Random.nextInt(1, 6)
    val answer = when(randomNumber) {
        1 -> "Определенно да!"
        2 -> "Скорее всего нет"
        3 -> "Спроси позже"
        4 -> "Не рассчитывай на это"
        5 -> "Да, безусловно!"
        else -> "Ошибка!"
    }

    println("Длинна вопроса: ${userQuestion.trim().length}")
    println("Ответ: $answer")
}