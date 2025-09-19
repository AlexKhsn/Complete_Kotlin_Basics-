package objectOrientedProgramming.introduction.practice

fun main() {
    val engineer = Engineer()
    val doctor = Doctor()

    engineer.name = "Engineer"
    doctor.name = "Doctor"

    engineer.salary = 3000
    doctor.salary = 5000

    println("Engineer's salary is ${engineer.salary}")
    println("Doctor's salary is ${doctor.salary}")

    engineer.study()
    engineer.study()
    engineer.study()
    println("Engineer's salary is ${engineer.salary}")

    doctor.study()
    doctor.study()
    println("Doctor's salary is ${doctor.salary}")

    engineer.work()
    engineer.work()
    engineer.work()
    doctor.work()
    doctor.work()
}

open class Job {
    var name = ""
    var revenue = 0
    var salary = 0

    fun work() {
        revenue += salary
        println("$name's revenue is $revenue$")
    }

    fun study() {
        salary += 1000
        println("$name's salary after studying increased to $salary$")
    }
}

class Engineer : Job()

class Doctor : Job()
