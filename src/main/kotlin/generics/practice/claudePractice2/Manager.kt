package generics.practice.claudePractice2

class Manager(name: String, salary: Int, department: Department) : Employee(name, salary, department) {
    var team = 0

    override fun calculateBonus(): Int {
        return team * 2000
    }

    fun earnCommission(amount: Int) {
        salary += salary * amount / 100
    }
}
