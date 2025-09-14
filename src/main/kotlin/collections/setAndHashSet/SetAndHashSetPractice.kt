package collections.setAndHashSet

fun main() {
    //  Exercise 1

    val colors = hashSetOf<String>()
    colors.add("blue")
    colors.add("yellow")
    colors.add("pink")
    val addList = listOf("black", "white", "orange", "blue")
    colors.addAll(addList)

    colors.remove("yellow")

    println(colors)

    println()

    //  Exercise 2

    val objects = hashSetOf("Laptop", "Phone", "Coffee", "Pen", "Rubber Duck", "Iqos", "Heats")
    val toRemove = setOf("Coffee", "Heats", "Rocket", "Coffee")
    objects.removeAll(toRemove)

    println("After cleaning next items will remain: $objects")

    println()

    //  Exercise 3

    val customers = hashSetOf("John", "Steve", "Alex", "Maria")
    println("Введи имя нового пользователя: ")
    val customer = readLine() ?: ""
    customers.add(customer)
    println(customers)
    println("Введи имя пользователя что бы удалить его: ")
    val customerToRemove = readLine() ?: ""
    customers.remove(customerToRemove)
    println(customers)
}
