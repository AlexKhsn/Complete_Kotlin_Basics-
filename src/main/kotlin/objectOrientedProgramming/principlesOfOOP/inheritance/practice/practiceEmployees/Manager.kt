package objectOrientedProgramming.principlesOfOOP.inheritance.practice.practiceEmployees

class Manager(
    override val name: String,
    override val id: Int,
    override val baseSalary: Double,
    val teamSize: Int,
) : Employee() {
    override fun calculateSalary(): Double {
        return super.calculateSalary() + teamSize * 1000
    }

    override fun getDetails(): String {
        return super.getDetails() + ", Команда: $teamSize человек(а)"
    }
}
