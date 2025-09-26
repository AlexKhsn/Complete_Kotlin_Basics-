package extensions.extentionFunctions.practice

fun main() {
    println("Something".getCustomName())
    println(2432.getCustomName())
    println(2.4F.getCustomName())
}

fun String.getCustomName(): String {
    return "A string of characters"
}

fun Int.getCustomName(): String {
    return "A integer number"
}

fun Float.getCustomName(): String {
    return "Floating point number"
}
