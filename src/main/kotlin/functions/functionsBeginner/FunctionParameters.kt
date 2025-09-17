package functions.functionsBeginner

fun main() {
    for (i in 1..5) double(5)

    println()

    val people = listOf("Alex", "Anna", "Bob")
    sayHelloToPeople(people)

    println()

    double2(2)
    double2(3, "3 * 2 = ")
}

fun double(number: Int) {
    println("Double $number = ${number * 2}")
}

fun sayHelloToPeople(people: Collection<String>) {
    for (person in people) {
        println("Hello, $person!")
    }
}

fun double2(number: Int, message: String = "Double is: ") {
    println("$message${number * 2}")
}

/**
 *  1) Параметры указываются в скобках (имя переменной: тип)
 *  2) Значение по-умолчанию (имя переменной: тип = значение по-умолчанию)
 *     Если вызвать функцию без параметра с указанным значением по-умолчанию, то будет использовано
 *     значение по-умолчанию.
 *     Если передать параметр с указанным значением по-умолчанию, то будет использовано значение
 *     переданное при вызове функции
 */
