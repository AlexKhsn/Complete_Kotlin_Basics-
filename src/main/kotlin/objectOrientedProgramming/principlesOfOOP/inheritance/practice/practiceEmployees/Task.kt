package objectOrientedProgramming.principlesOfOOP.inheritance.practice.practiceEmployees

fun main() {
    val manager = Manager("Manager", 1, 5000.0, 5)
    val developer = Developer("Developer", 2, 14342.56, "Kotlin")

    println(manager.getDetails())
    println(manager.calculateSalary())

    println(developer.getDetails())
    println(developer.calculateSalary())
    developer.writeCode()
}
