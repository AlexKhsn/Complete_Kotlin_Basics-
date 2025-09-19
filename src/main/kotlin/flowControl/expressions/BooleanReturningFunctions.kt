package flowControl.expressions

fun main() {
    val animals = mutableListOf("cat")

    if (animals.isEmpty()) animals.add("dog")
    println(animals)

    if (animals.add("horse")) println("Horse was successfully added")
}
