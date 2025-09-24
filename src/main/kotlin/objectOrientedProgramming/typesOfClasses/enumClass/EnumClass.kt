package objectOrientedProgramming.typesOfClasses.enumClass

fun main() {
    val color = Colors.RED
    when (color) {
        Colors.RED -> println("You choose red")
        Colors.GREEN -> println("You choose green")
        Colors.BLUE -> println("You choose blue")
    }

    println(Colors.RED.timesUsed)
    println(Colors.GREEN.name)
    println(Colors.BLUE.ordinal)
}

enum class Colors(val timesUsed: Int) {
    RED(34),
    GREEN(54),
    BLUE(12),
}
