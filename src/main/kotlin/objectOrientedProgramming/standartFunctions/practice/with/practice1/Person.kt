package objectOrientedProgramming.standartFunctions.practice.with.practice1

class Person(
    var firstName: String,
    var lastName: String,
    var age: Int,
) {
    fun printInfo() {
        println("$firstName $lastName is $age years old")
    }
}
