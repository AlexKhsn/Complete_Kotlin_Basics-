package generics.practice.shop

class Clothes(
    id: Int,
    name: String,
    price: Double,
    val size: Int,
) : Product(
        id,
        name,
        price,
    ),
    Saleable,
    Programmable {
    fun wash() {
        println("$name стирается")
    }

    override fun saleDiscount(): Double {
        return price - (price * 10 / 100)
    }

    override fun programDiscount(): Double {
        return price - (price * 5 / 100)
    }
}
