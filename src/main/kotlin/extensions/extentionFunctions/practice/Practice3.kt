package extensions.extentionFunctions.practice

fun main() {
    String.whatType()
}

fun String.Companion.whatType() {
    println("It's a string class type")
}
