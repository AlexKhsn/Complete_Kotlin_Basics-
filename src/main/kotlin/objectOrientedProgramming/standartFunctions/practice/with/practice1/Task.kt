package objectOrientedProgramming.standartFunctions.practice.with.practice1

fun main() {
    val alex = Person(
        "Alex",
        "Ivanov",
        25,
    )

    alex.printInfo()

    with(alex) {
        firstName = "Den"
        lastName = "Bobr"
        age = 53
        printInfo()
    }
}
