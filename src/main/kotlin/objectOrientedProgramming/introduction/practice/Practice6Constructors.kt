package objectOrientedProgramming.introduction.practice

fun main() {
    val user1 = User()
    val user2 = User("Lol")
    val user3 = User("Ololo", 54.43)

    user1.getInfo()
    user2.getInfo()
    user3.getInfo()
}

class User {
    constructor() {
        userName = "Guest"
        userBalance = 0.0
        canAfford()
    }

    constructor(name: String) {
        userName = name
        userBalance = 0.0
        canAfford()
    }

    constructor(name: String, balance: Double) {
        userName = name
        userBalance = balance
        canAfford()
    }

    var userName = "default"
    var userBalance = 0.0
    val tshirtPrice = 20

    fun getInfo() {
        println("$userName's balance is $userBalance$")
    }

    fun canAfford() {
        if (userBalance > tshirtPrice) {
            println("$userName can afford ${(userBalance / tshirtPrice).toInt()} t-shirts")
        } else {
            println("$userName can't afford any t-shirt!")
        }
    }
}
