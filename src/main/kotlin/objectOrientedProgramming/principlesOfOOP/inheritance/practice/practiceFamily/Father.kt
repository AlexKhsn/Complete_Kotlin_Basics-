package objectOrientedProgramming.principlesOfOOP.inheritance.practice.practiceFamily

open class Father {
    open val firstName = "John"
    val lastName = "Doe"

    open fun fullName() {
        println("Father's full name is $firstName $lastName")
    }
}
