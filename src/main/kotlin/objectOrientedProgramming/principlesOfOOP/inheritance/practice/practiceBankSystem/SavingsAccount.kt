package objectOrientedProgramming.principlesOfOOP.inheritance.practice.practiceBankSystem

open class SavingsAccount(
    override val accountNumber: Long,
    override val ownerName: String,
    override var balance: Double,
    open val interestRate: Double,
) : Account() {
    override fun withdraw(amount: Double): Boolean {
        if (amount > balance) {
            println("нельзя снимать больше баланса")
            return false
        } else {
            return true
        }
    }

    open fun calculateInterest(): Double {
        return balance * (interestRate / 100)
    }
}
