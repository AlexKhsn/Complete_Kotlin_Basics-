package collections.listAndArrayList

fun main() {
    //  Exercise 1

    val favouriteAnimals = listOf("Dog", "Cat", "Hedgehog", "Parrot")
    println("${favouriteAnimals.size} animals are in my fav list")
    println("${favouriteAnimals[1]} is second in my fav list")

    val customers = arrayListOf("John", "Alex", "Jack", "Rose")
    println(customers)

    val newCustomer = "Dima"
    customers.add(newCustomer)

    println(customers)

    customers.remove("John")

    println(customers)

//  Exercise 2

    val items = arrayListOf("laptop", "mouse", "pen", "paper", "mug", "phone")
    val removedItems = listOf("pen", "paper", "mug", "phone")
    val clone = items
    clone.removeAll(removedItems)

    println("$items are left on the table")
}
