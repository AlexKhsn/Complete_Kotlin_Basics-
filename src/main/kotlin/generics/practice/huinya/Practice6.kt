package generics.practice.huinya

fun main() {
    val printer1 = Printer<List<String>>()
    printer1.iterate(listOf("Alex", "Alex", "Jim", "Bob"))

    val printer2 = Printer<Set<String>>()
    printer2.iterate(setOf("Alex", "Alex", "Alex", "Tim"))
}

class Printer<T : Collection<String>> {
    fun iterate(collection: T) {
        collection.forEach {
            println(it.toString())
        }
    }
}
