package generics.practice.storage

class Storage<T> {
    var item: T? = null

    fun store(item: T) {
        this.item = item
    }

    fun get(): T? {
        return item
    }

    fun isEmpty(): Boolean = item == null
}
