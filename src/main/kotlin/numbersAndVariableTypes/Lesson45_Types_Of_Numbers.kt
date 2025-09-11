package numbersAndVariableTypes

// ::class.java - возвращает тип данных

fun main(args: Array<String>) {
    val items = 5
    println(items::class.java)

    val nbOfPeople = 7500000000000
    println(nbOfPeople::class.java)

    val price = 29.99
    println(price::class.java)

    val pi = 3.14159265358979
    println(pi::class.java)
}
