package objectOrientedProgramming.principlesOfOOP.inheritance.practice.practiceShop

class Book(
    override val name: String,
    override val price: Double,
    val author: String,
) : Product() {
    override fun getInfo(): String {
        return super.getInfo() + " Автор: $author"
    }

    override fun calculateDiscount(percent: Int): Double {
        return super.calculateDiscount(percent + 5)
    }
}
