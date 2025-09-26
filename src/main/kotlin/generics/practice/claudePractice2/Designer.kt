package generics.practice.claudePractice2

class Designer(name: String, salary: Int, department: Department) : Employee(name, salary, department) {
    var designes = 0

    override fun calculateBonus(): Int {
        return designes * 800
    }

    fun createDesign() {
        salary += 300
        designes++
    }
}
