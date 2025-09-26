package generics.practice.shop

import generics.practice.shop.products.Product

class Cart<T : Product> {
    val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun showItems(): List<T> {
        items.forEach { it.displayInfo() }
        return items
    }

    fun getTotalPrice(): Double {
        return items.sumOf { it.price }
    }

    fun showExpensive(): T? {
        return items.maxByOrNull { it.price }
    }
}
