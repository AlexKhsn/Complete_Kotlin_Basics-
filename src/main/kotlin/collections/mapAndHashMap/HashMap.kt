package collections.mapAndHashMap

fun main() {
    val count = mutableMapOf(
        1 to "string",
        Pair(1, "One"),
        Pair(2, "two"),
        Pair(3, "three"),
    )
    count.put(5, "five")
    println(count)

    count[6] = "Six"
    println(count)

    val countMore = mapOf(
        Pair(20, "Twenty"),
        Pair(30, "Thirty"),
    )

    count.putAll(countMore)
    println(count)

    count.remove(20)
    println(count)

    count.replace(2, "twoTwo")
    println(count)

    count.clear()
    println(count)
}
