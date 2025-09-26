package generics.practice.huinya.practice3

interface Storage<T> {
    fun get(): T

    fun add(item: T)
}
