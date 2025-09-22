package objectOrientedProgramming.principlesOfOOP.inheritance.practice.practiceBankSystem

open class Account {
    open val accountNumber = 0L
    open val ownerName = ""
    open var balance = 0.0

    fun deposit(amount: Double) {
        balance += amount
    }

    fun getAccountInfo() {
        println(
            """
            Номер счета: $accountNumber
            Владелец: $ownerName
            Баланс: $balance$
            """.trimIndent(),
        )
    }

    open fun withdraw(amount: Double): Boolean {
        if (balance >= amount) {
            return true
        } else {
            return false
        }
    }
}
