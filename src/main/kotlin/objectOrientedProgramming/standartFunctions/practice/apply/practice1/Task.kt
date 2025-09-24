package objectOrientedProgramming.standartFunctions.practice.apply.practice1

fun main() {
    val lock = Lock().apply {
        secretCode = 55
        unlock(
            Key().apply {
                println("Введи код: ")
                secretCode = readln()?.toLong()
                carve()
            },
        )
    }
}
