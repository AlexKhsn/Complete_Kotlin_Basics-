package functions.functionsContinued

fun main() {
    //  Exercise 1

    val users = mutableMapOf<String, Double?>(
        "Alex" to 1000.0,
        "John" to 543.43,
        "Kate" to 128.57,
    )
    doubleBalance(users)

    println()

    //  Exercise 2

    greetUser()
}

fun doubleBalance(users: MutableMap<String, Double?>) {
    println(users)

    fun doubleAmount(amount: Double?): Double? = amount?.times(2)

    for (user in users.keys) {
        users[user] = doubleAmount(users[user])
    }

    println(users)
}

fun greetUser() {
    fun printGreeting(name: String) {
        println("Hello, $name!")
    }

    while (true) {
        println("Enter your name: ")
        val name = readln() ?: ""

        if (name != "") printGreeting(name) else break
    }
}
