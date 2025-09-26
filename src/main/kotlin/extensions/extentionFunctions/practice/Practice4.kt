package extensions.extentionFunctions.practice

fun main() {
    Double.className()
}

fun Double.Companion.className() {
    println("It's a Double class")
}

/**
 * Add a companion object function to the Double class that prints out the class name.
 * Call the companion object extension function.
 */
