package generics.practice.bank

class PiggyBank<T> {
    val items = mutableListOf<T>()

    fun add(item: T) = items.add(item)

    fun getAll(): List<T> = items

    fun count() {
        println("Всего ${items.size} вещей")
    }
}
