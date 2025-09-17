package functions

var totalCalls = 0
var processedCount = 0

fun main() {
    //  Exercise 1 "Простые текстовые функции"

    val names = listOf("Alex", "Maria", "John", "Kate", "Lo")

    while (true) {
        println(
            """

        Выбери действие:
        1) Поприветствовать
        2) Показать имена в верхнем регистре
        3) Показать имена в верхнем регистре и добавить префикс
        4) Показать строку имен
        5) Проверка имен на длину
        0) Выход
            """.trimIndent(),
        )

        val action = (readln() ?: "").toInt()
        when (action) {
            1 -> {
                totalCalls++
                for (name in names) {
                    println(greet(name))
                }
            }
            2 -> {
                totalCalls++
                for (name in names) {
                    println(format(name))
                }
            }
            3 -> {
                totalCalls++
                println("Введи префикс что бы добавить: ")
                val prefix = readln() ?: ""
                for (name in names) {
                    println(format(name, prefix))
                }
            }
            4 -> {
                totalCalls++
                println(combineNames(*names.toTypedArray()))
            }
            5 -> {
                totalCalls++
                for (name in names) {
                    println(processName(name))
                }
            }
            0 -> {
                println("Выполнено операций: $totalCalls")
                break
            }
        }
    }

    println()

    //  Exercise 2 "Анализатор чисел"

    val numbers = listOf(15, 42, 8, 23, 67, 4, 91, 12, 56, 3)

    while (true) {
        println(
            """

        Выбери действие:
        1) Показать четные/нечетные числа
        2) Умножить числа на 2
        3) Умножить числа на число
        4) Показать сумму первых 3х чисел
        5) Проанализировать категории чисел
        6) Показать кол-во обработанных чисел
        0) Выход
            """.trimIndent(),
        )

        val action = (readln() ?: "").toInt()

        when (action) {
            1 -> {
                processedCount++
                for (num in numbers) {
                    if (isEven(num)) println("$num - четное") else println("$num - нечетное")
                }
            }
            2 -> {
                processedCount++
                for (num in numbers) {
                    println("$num * 2 = ${calculate(num)}")
                }
            }
            3 -> {
                processedCount++
                println("Введи число на которое умножить: ")
                val inputNumber = (readln() ?: "").toInt()
                for (num in numbers) {
                    println("$num * $inputNumber = ${calculate(num, inputNumber)}")
                }
            }
            4 -> {
                processedCount++
                println(sum(*numbers.subList(0, 3).toIntArray()))
            }
            5 -> {
                processedCount++
                for (num in numbers) {
                    println(analyzeNumber(num))
                }
            }
            6 -> println("Кол-во операций: $processedCount")
            0 -> break
        }
    }
}

//  Exercise 1 Functions
fun greet(name: String): String = "Привет, $name!"

fun format(text: String): String = text.uppercase()

fun format(text: String, prefix: String): String = (prefix + " " + text).uppercase()

fun combineNames(vararg names: String): String {
    var result = ""
    for (name in names) {
        result += name + ", "
    }

    return result.dropLast(2)
}

fun processName(name: String): String {
    fun checkLength(): String {
        if (name.length < 3) return name + '!' else return name
    }

    return checkLength()
}

//  Exercise 2 Functions

fun isEven(num: Int): Boolean = num % 2 == 0

fun calculate(num: Int): Int = num * 2

fun calculate(num: Int, multiplier: Int) = num * multiplier

fun sum(vararg values: Int): Int {
    var sum = 0
    for (num in values) {
        sum += num
    }

    return sum
}

fun analyzeNumber(num: Int): String {
    fun check(): String {
        if (num < 10) return "Малое"
        else if (num >= 10 && num <= 50) return "Среднее"
        else return "Большое"
    }
    val result = "$num - ${check()} число"
    return result
}
