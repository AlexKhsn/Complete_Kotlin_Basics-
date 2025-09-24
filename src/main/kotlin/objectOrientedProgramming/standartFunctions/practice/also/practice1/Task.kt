package objectOrientedProgramming.standartFunctions.practice.also.practice1

fun main() {
    Book().apply {
        print()
    }
        .also {
            println("Printing bool $it")
            println("Sending an email about book $it")
        }
}
