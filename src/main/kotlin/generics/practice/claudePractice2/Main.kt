package generics.practice.claudePractice2

fun main() {
    val programmer = Programmer("Alex", 2500, Department.IT)
    val programmer2 = Programmer("John", 2120, Department.IT)
    val manager = Manager("Bob", 3999, Department.SALES)
    val manager2 = Manager("Jim", 6199, Department.SALES)
    val designer = Designer("Tim", 1232, Department.MARKETING)
    val designer2 = Designer("Sam", 1732, Department.HR)

    printAllBonuses(
        listOf(
            programmer,
            manager,
            designer,
        ),
    )

    println(
        filterByDepartment(
            listOf(
                programmer,
                programmer2,
                manager,
                manager2,
                designer,
                designer2,
            ),
            Department.HR,
        ),
    )

    println()

    generateReport(
        listOf(
            programmer,
            programmer2,
            manager,
            manager2,
            designer,
            designer2,
        ),
    )
}

fun giveRaiseToAll(employees: List<Employee>) {
    employees.forEach { it.salary += it.salary * 10 / 100 }
}

fun printAllBonuses(employees: List<Employee>) {
    employees.forEach {
        println("Бонус для ${it.name} - ${it.calculateBonus()}$")
    }
}

fun Employee.getFormattedSalary(): String {
    return "$$$salary"
}

fun filterByDepartment(employees: List<Employee>, dept: Department): List<Employee> {
    return employees.filter { it.department == dept }
}

fun generateReport(employees: List<Employee>) {
    val departmentGroups = employees.groupBy { it.department }

    departmentGroups.forEach { (department, employeesDept) ->
        val count = employeesDept.size
        val totalSalary = employeesDept.sumOf { it.salary }
        val averageSalary = totalSalary / count

        println("=== $department ===")
        println("Сотрудников: $count")
        println("Средняя зарплата: $$averageSalary")
        println()
    }
}
