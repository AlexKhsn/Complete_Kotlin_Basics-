package objectOrientedProgramming.introduction.practice

fun main() {
    val account = Account()
    println("Amount is - ${account.amount}")
    println("Interest rate is - ${account.interestRate}")

    println()

    account.amount = 5000
    println("Amount is - ${account.amount}")
    println("Interest rate is - ${account.interestRate}")

    println()

    account.amount = 12000
    println("Amount is - ${account.amount}")
    println("Interest rate is - ${account.interestRate}")
}

class Account {
    var amount = 500
        get() = field
        set(value) {
            field = value
            if (field < 1000) interestRate = 1.0
            else if (field < 10000) interestRate = 0.5
            else interestRate = 0.2
        }
    var interestRate = 1.0
}
