package objectOrientedProgramming.principlesOfOOP.inheritance.practice.practiceBankSystem

class PremiumSavingsAccount(
    override val accountNumber: Long,
    override val ownerName: String,
    override var balance: Double,
    val minimumBalance: Double,
) : SavingsAccount(accountNumber, ownerName, balance, 7.0) {
    override fun withdraw(amount: Double): Boolean {
        if (balance - amount < minimumBalance) {
            println("нельзя снимать ниже минимального баланса")
            return false
        } else {
            return true
        }
    }

    override fun calculateInterest(): Double {
        return balance * ((interestRate + 5.0) / 100)
    }
}
