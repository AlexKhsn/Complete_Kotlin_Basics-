package objectOrientedProgramming.principlesOfOOP.inheritance.practice.practiceEmployees

open class Employee {
    open val name = "Default"
    open val id = 0
    open val baseSalary = 500.00

    open fun getDetails(): String {
        return "Сотрудник: $name, id: $id, минимальная зарплата: $baseSalary$"
    }

    open fun calculateSalary(): Double = baseSalary
}
