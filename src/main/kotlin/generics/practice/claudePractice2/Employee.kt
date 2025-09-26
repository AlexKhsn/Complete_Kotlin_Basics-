package generics.practice.claudePractice2

abstract class Employee(val name: String, var salary: Int, val department: Department) {
    abstract fun calculateBonus(): Int

    fun showInfo() {
        println("====Информация о сотруднике====")
        println("Имя сотрудника: $name")
        println("Зарплата: $salary$")
    }

    fun raiseSalary(amount: Int) {
        salary += amount
    }
}
