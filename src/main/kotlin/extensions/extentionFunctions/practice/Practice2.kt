package extensions.extentionFunctions.practice

fun main() {
    val names = mutableListOf(1, 5, 23, 123, 4, 23, 43, 3, 6, 7, 2, 34, 6534)
    println(names.howMany())
}

fun MutableList<Int>.howMany(): String {
    return "This list contains $size elements"
}
/**
 * Add an extension function to the ArrayList class that returns a message saying how many elements the list contains.
 * Create an ArrayList and print out the extension function message.
 */
