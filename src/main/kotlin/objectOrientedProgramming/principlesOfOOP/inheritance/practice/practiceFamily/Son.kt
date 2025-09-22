package objectOrientedProgramming.principlesOfOOP.inheritance.practice.practiceFamily

class Son : Father() {
    override val firstName = "David"

    override fun fullName() {
        super.fullName()
        println("Father's name is ${super.firstName}")
    }
}
