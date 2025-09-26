package generics.practice.shop.products

import generics.practice.shop.intrfs.BatchDiscountable
import generics.practice.shop.intrfs.Studentable

class Books(
    id: Int,
    name: String,
    price: Double,
    val author: String,
) : Product(
        id,
        name,
        price,
    ),
    BatchDiscountable,
    Studentable {
    fun read() {
        println("Читаем книгу $name")
    }

    override fun batchDiscount() {
        println("Скидка на комплект")
    }

    override fun studentDiscount(): Double {
        return price - (price * 7 / 100)
    }
}
