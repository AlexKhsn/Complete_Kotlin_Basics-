package objectOrientedProgramming.standartFunctions.practice.let.practice3

fun main() {
    val names = mutableListOf<String?>()

    while (true) {
        println("Введи имя: ")
        val name = readln()
        if (name == "stop") break

        name?.let {
            if (it.trim() != "") {
                names.add(it)
            } else {
                names.add(null)
            }
        }
    }

    names.forEach {
        it?.let {
            println("Hello, $it!")
        }
    }
}
