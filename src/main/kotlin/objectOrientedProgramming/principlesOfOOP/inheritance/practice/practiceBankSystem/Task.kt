package objectOrientedProgramming.principlesOfOOP.inheritance.practice.practiceBankSystem

fun main() {
    val accounts = listOf(
        SavingsAccount(
            234234324,
            "Alex",
            2344.34,
            2.5,
        ),
        PremiumSavingsAccount(
            2342342454,
            "John",
            5623.34,
            1234.32,
        ),
    )

    fun processAccounts(accounts: List<Account>) {
        accounts.forEach { account: Account -> account.getAccountInfo() }
        accounts.forEach { account: Account -> account.withdraw(3343.23) }
    }

    processAccounts(accounts)
}
