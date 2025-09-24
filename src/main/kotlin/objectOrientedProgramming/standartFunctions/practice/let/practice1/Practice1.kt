package objectOrientedProgramming.standartFunctions.practice.let.practice1

fun main() {
    println("Введи текст: ")

    val text = readln()
    text?.let {
        println(text.toInt() * 2)
    }
}
