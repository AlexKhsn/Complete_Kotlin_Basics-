package objectOrientedProgramming.standartFunctions.practice.let.practice2

fun main() {
    val animals = mutableListOf<String?>()

    for (i in 1..3) {
        println("Введи животное: ")

        val input = readln()
        input?.let {
            if (it.trim() != "") {
                animals.add(it)
            } else {
                animals.add(null)
            }
        }
    }

    animals.forEach {
        it?.let {
            println("Feeding the $it")
        }
    }
}
