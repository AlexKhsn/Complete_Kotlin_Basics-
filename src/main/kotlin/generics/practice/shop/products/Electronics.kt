package generics.practice.shop.products

import generics.practice.shop.intrfs.Seasonable
import generics.practice.shop.intrfs.Tradable

class Electronics(
    id: Int,
    name: String,
    price: Double,
    val warrantyMonths: Int,
) : Product(id, name, price), Seasonable, Tradable {
    fun repair() {
        println("Товар $name отремонтирован!")
    }

    override fun seasonDiscount(discount: Int): Double {
        return price - (price * discount / 100)
    }

    override fun tradeIn() {
        println("Скидка при сдаче этого товара $name")
    }
}
