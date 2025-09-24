package generics.practice.practice3

interface Storage<T> {
    fun get(): T
    fun add(item: T)
}
