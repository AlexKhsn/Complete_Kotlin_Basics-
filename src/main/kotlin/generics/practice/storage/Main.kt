package generics.practice.storage

fun main() {
    val stringStorage = Storage<String>()
    val numberStorage = Storage<Int>()

    stringStorage.store("Hello")
    numberStorage.store(42)

    println(stringStorage.get())
    println(stringStorage.isEmpty())

    println(numberStorage.get())
    println(numberStorage.isEmpty())
}
