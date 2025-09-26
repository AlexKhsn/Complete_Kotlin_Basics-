package generics.practice.claudePractice2

class Programmer(name: String, salary: Int, department: Department) : Employee(name, salary, department) {
    var finishedProjects = 0

    override fun calculateBonus(): Int {
        return finishedProjects * 1000
    }

    fun completeProject() {
        salary += 500
        finishedProjects++
    }
}
