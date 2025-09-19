package objectOrientedProgramming.principlesOfOOP.practice.excessive1

open class Father() {
    open val firstName: String = "John"
    val lastName: String = "Doe"

    open fun printName() {
        println("Father's name is $firstName $lastName")
    }
}
