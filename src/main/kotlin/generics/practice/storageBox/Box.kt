package generics.practice.storageBox

class Box<T> {
    var item: T? = null

    fun put(item: T) {
        this.item = item
    }

    fun get(): T? = item

    fun isEmpty(): Boolean = item == null

    fun clear() {
        item = null
        println("Коробка очищена")
    }
}
