package generics.practice.shop

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
    Complectable,
    Studentable {
    fun read() {
        println("Читаем книгу $name")
    }

    override fun complectDiscount() {
        println("Скидка на комплект")
    }

    override fun studentDiscount(): Double {
        return price - (price * 7 / 100)
    }
}
