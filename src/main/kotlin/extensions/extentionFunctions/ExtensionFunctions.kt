package extensions.extentionFunctions

fun main() {
    val name = "jimmy"
    println(name.slim())
    println(name.betterLength)
}

fun String.slim() : String {
    return this.substring(1, length - 1)
}

val String.betterLength : Int
    get() {
        return 200
    }

