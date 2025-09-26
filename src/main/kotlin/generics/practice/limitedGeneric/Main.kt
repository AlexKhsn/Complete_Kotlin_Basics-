package generics.practice.limitedGeneric

fun main() {
    println(findMax(2, 45, 12))
    println(findMax("Alex", "Bob", "Karol"))
}

fun <T : Comparable<T>> findMax(a: T, b: T, c: T): T {
    var max = a

    if (b > max) return b
    if (c > max) return c

    return a
}
