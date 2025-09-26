package generics.practice.genericFunctions

fun main() {
    swap("Alex", "Bob")
    swap(23, 54)

    println()

    isEqual("Alex", "Alex")
    isEqual(43, 25)

    println()

    println(getFirst(listOf("Alex", "Bob", "Jim", "Tim")))
    println(getFirst(listOf<Int>()))
}

fun <T> swap(a: T, b: T) {
    println("Первое: $b, второе: $a")
}

fun <T> isEqual(first: T, second: T): Boolean {
    val result = first == second
    println("$first = $second - $result")
    return result
}

fun <T> getFirst(items: List<T>): T? {
    var first: T? = null
    if (!items.isEmpty()) first = items[0]
    return first
}
