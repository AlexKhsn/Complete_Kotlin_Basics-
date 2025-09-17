package functions.functionsBeginner

fun main() {
    val r = 63
    val area = calculateCircleArea(r)
    println("A circle with a radius $r has an area of $area")

    println()

    val clients = listOf("Alex", "Bob", "William")
    for (client in clients) {
        val greeting = personalGreeting(client)
        println(greeting)
    }

    println()

    val number = 5
    val sum = plus5(number)
    println("$number + 5 = $sum")
}

fun calculateCircleArea(radius: Int): Double {
    val pi = 3.1415
    return pi * radius * radius
}

fun personalGreeting(person: String): String {
    val greeting = when (person[0]) {
        'A' -> "Are you ok, $person?"
        'W' -> "What's up, $person?"
        else -> "Hi, $person!"
    }

    return greeting
}

fun plus5(number: Int = 0) = number + 5

/**
 *  1) Для возврата значения из функции используется оператор return
 *  2) Что бы функция вернула како-то значение, необходимо указать тип данных, которые функция будет
 *      возвращать, при ее объявлении
 *      (fun smth(val: type of val = defaultValue): type of return {})
 *      (fun smth(number: Int = 0): Int {})
 *  3) Если функция возвращает значение и может быть написана в одну строку, то использовать
 *      return и указывать тип возвращаемого значения - не обязательно. Вместо этого код из функции
 *      пишется после знака "="
 *      fun plus5(number: Int = 0) = number + 5
 */
