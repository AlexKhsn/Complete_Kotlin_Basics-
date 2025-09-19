package objectOrientedProgramming.introduction.practice

fun main() {
    val laptop = Laptop2("Windows")
}

class Laptop2(operationSystem: String) {
    var name = "default"

    init {
        println("The operation system '$operationSystem' is installing")
    }
}
