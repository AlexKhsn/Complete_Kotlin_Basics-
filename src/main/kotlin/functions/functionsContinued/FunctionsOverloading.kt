package functions.functionsContinued

fun main() {
    println(multiply(3))
    println(multiply(3, 5))

    println()

    sayHello("Alex")
    sayHello(listOf("Dima", "Petya", "John"))
}

fun multiply(number: Int) = number * 2

fun multiply(number: Int, multiplier: Int) = number * multiplier

fun sayHello(person: String) {
    println("Hello, $person!")
}

fun sayHello(persons: Collection<String>) {
    for (person in persons) {
        println("Hi, $person!")
    }
}

/**
 *  Можно создать 2 или больше функций с одинаковым именем, но разным кол-вом аргументов или
 *  разными типами аргументов.
 *  Это позволяет использовать одно имя функции с одинаковым или схожим фукнционалом, но с разными
 *  параметрами.
 *
 *  Например:
 *  функции sayHello() имеют одинаковое имя, но принимают разные параметры. Поэтому можно вызвать
 *  эти функции как со строкой в качестве аргумента, так и с коллекцией
 */
