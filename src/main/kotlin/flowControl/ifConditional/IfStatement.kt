package flowControl.ifConditional

fun main() {
    println("Is it night time? (true/false)")

    val night = (readln() ?: "true").toBoolean()

    if (night) {
        println("Sleep")
    } else {
        println("Be active")
    }

    println()

    println("How much money do you have?")
    var clientFunds = (readln() ?: "0").toDouble()
    val price = 50
    var clientProducts = 0

    if (clientFunds > price) {
        clientFunds -= price
        clientProducts += 1
        println("You have purchased $clientProducts products")
        println("Your balance is $clientFunds$")
    } else {
        println("You have insufficient funds")
    }

    println()

    val petStore = listOf("cat", "dog", "rabbit")
    val hasCatFood = true

    if (petStore.contains("cat")) {
        if (hasCatFood) {
            println("Bought cat and cat food")
        } else {
            println("Bought cat")
        }
    } else {
        println("Ask pet store to get cat")
    }
}
