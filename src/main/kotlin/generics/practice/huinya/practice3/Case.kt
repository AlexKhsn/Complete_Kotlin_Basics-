package generics.practice.huinya.practice3

class Case<T, E>(var item: T, var item2: E) : Storage<T> {
    override fun get(): T {
        return item
    }

    fun get2(): E {
        return item2
    }

    override fun add(item: T) {
        this.item = item
    }

    override fun toString(): String {
        return "Case(item=$item, item2=$item2"
    }
}
