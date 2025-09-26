package generics.practice.shop

fun main() {
    val customer1 = Customer(1, "Alex", "Alex@alex.com")
    val customer2 = Customer(1, "Alex", "Alex@alex.com")
    val customer3 = Customer(2, "Bob", "bob@dolboeb.com")

    val product1 = Electronics(1, "Phone", 1234.00, 12)
    val product2 = Books(2, "Harry Potter", 54.00, "J.K.Rowling")
    val product3 = Clothes(3, "T-shirt", 15.00, 41)

    product1.repair()
    product2.read()
    product3.wash()
}

fun applySaleToAll(products: List<Saleable>) {
    products.forEach { println(it.saleDiscount()) }
}

fun applyTradeInToAll(products: List<Tradable>) {
    products.forEach { println(it.tradeIn()) }
}

// fun <T> processCart(cart: Cart<T>) {
//    cart.add()
// }
