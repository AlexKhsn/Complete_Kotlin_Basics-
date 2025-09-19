package objectOrientedProgramming.introduction.practice

fun main() {
    val bankAccount = BankAccount()
    println("Amount: ${bankAccount.amount}")
    println("Rating: ${bankAccount.creditRating}")

    println()

    bankAccount.amount = 500
    println("Now Amount: ${bankAccount.amount}")
    println("Now Rating: ${bankAccount.creditRating}")

    println()

    bankAccount.amount = 0
    println("Now Amount: ${bankAccount.amount}")
    println("Now Rating: ${bankAccount.creditRating}")
}

class BankAccount {
    var amount = 1000
        get() = field
        set(value) {
            field = value
            if (field > 0) creditRating += 100
            else creditRating -= 200
        }
    var creditRating = 500
}
