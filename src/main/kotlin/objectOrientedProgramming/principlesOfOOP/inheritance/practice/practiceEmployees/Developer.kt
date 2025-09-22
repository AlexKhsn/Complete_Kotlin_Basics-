package objectOrientedProgramming.principlesOfOOP.inheritance.practice.practiceEmployees

class Developer(
    override val name: String,
    override val id: Int,
    override val baseSalary: Double,
    val programmingLanguage: String,
) : Employee() {
    override fun calculateSalary(): Double {
        return super.calculateSalary() + 5000
    }

    fun writeCode() {
        println("$name пишет код на $programmingLanguage")
    }
}
