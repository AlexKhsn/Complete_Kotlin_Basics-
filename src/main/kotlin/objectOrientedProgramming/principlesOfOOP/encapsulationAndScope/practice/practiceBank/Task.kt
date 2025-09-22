package objectOrientedProgramming.principlesOfOOP.encapsulationAndScope.practice.practiceBank

fun main() {
    val bank = _root_ide_package_.objectOrientedProgramming.principlesOfOOP.encapsulationAndScope.practice.practiceBank.BankSafe()
    bank.checkItems()
    bank.checkItems()
    bank.unlock(234)
    bank.unlock(6454)
    bank.addItem("something new")
    bank.takeItem("something")
    bank.unlock(12345)
    bank.checkItems()
    bank.addItem("something new")
    bank.takeItem("car")
    bank.takeItem("gun")
    bank.checkItems()
}
