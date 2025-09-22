package objectOrientedProgramming.principlesOfOOP.inheritance.practice.practiceShop

class Electronics(
    override val name: String,
    override val price: Double,
    var warranty: Int,
) : Product() {
    override fun getInfo(): String {
        return super.getInfo() + " Гарантия: $warranty месяцев"
    }

    fun extendWarranty(months: Int) {
        warranty += months
    }
}
