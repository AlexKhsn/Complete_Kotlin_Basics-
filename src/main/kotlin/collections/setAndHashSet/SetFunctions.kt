package collections.setAndHashSet

fun main() {
    val numbers = setOf(23, 32, 23, 456, null, 23)
    println(numbers.size)

    println(numbers.contains(32))
    println(numbers.contains(8347))

    val newNumbers = setOf(4, 3)
    println(numbers.containsAll(newNumbers))

    println(numbers.containsAll(setOf(3, 5, 2)))

    println(numbers.isEmpty())
    println(setOf<Int>().isEmpty())
}
