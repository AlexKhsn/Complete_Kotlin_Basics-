package functions.lambdaFunctions

fun main() {
    val names = mutableListOf("Alex", "Bob", "John", "Tim")
    val lambdaFunction = { name: String -> println("#1 Hello, $name!") }

    sayHello(names, lambdaFunction)
    println()
    sayHello(names, { name: String -> println("#2 Hello, $name!") })
    println()
    sayHello(names) { name: String -> println("#3 Hello, $name!") }
}

fun sayHello(names: List<String>, lambdaFunction: (String) -> Unit) {
    for (name in names) {
        lambdaFunction(name)
    }
}

/**
 *  ФУНКЦИЯ ВЫСШЕГО ПОРЯДКА (FHO):
 *  1) Принимает другую функцию в параметрах
 *  2) В параметрах указывается имя переменной: тип данных.
 *     Для лямбда-функции имя: (Тип данных которые она принимает) -> тип данных которые возвращает
 *     лямбда. Если ничего не возвращает то Unit
 *  3) При вызове FHO лямбда может быть передана как в виде переменной, так и быть передана напрямую
 *     в параметры либо в скобках с другими параметрами, либо вне скобок
 */
