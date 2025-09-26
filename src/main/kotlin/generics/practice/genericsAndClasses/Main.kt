package generics.practice.genericsAndClasses

fun main() {
    val stringInt = makePair("Hello", 23)
    println(stringInt.swap())

    val boolString = makePair(true, "String")
}

fun <X, Y> makePair(x: X, y: Y): Pair<X, Y> {
    return Pair(x, y)
}
