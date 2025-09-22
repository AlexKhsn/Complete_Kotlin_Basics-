package objectOrientedProgramming.principlesOfOOP.inheritance.practice.practiceShop

open class Product {
    open val name = "Default"
    open val price = 0.0

    open fun getInfo(): String {
        return "Товар: $name, цена: $price$"
    }

    open fun calculateDiscount(percent: Int): Double {
        return price - (price * percent) / 100
    }
}
