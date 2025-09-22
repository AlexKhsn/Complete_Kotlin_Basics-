package objectOrientedProgramming.principlesOfOOP.inheritance.practice.practiceShop

fun main() {
    val book = Book("Harry Potter", 50.00, "J.K.Rowling")
    val electronics = Electronics("Kettle", 89.34, 5)

    println(book.getInfo())
    println(book.calculateDiscount(10))

    println(electronics.getInfo())
    println(electronics.calculateDiscount(10))
    electronics.extendWarranty(5)
    println(electronics.getInfo())
}
