package objectOrientedProgramming.standartFunctions.practice.also.practice2

fun main() {
    Car().apply {
        build()
    }
        .also {
            println("Log update: $it was built")
            println("Police is notified")
        }
}
