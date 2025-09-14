package collections.practice

fun main() {
    val productPrices = mutableMapOf<String, Double>(
        "laptop" to 680.39,
        "iphone" to 999.99,
        "bike" to 299.50,
        "speaker" to 50.0,
    )
    val productStock = mutableMapOf<String, Int>(
        "laptop" to 56,
        "iphone" to 1299,
        "bike" to 37,
        "speaker" to 482,
    )
    val discountProducts = mutableSetOf(
        "iphone",
        "speaker",
    )
    val orderHistory = mutableListOf(
        "laptop",
        "laptop",
        "speaker",
        "laptop",
        "bike",
        "iphone",
        "speaker",
    )
    val customerContacts = mutableMapOf(
        "Alex" to "alex@mail.com",
        "Dima" to "dima23@mail.com",
        "John" to "john@mail.com",
        "Subzero" to "sub@mail.com",
    )
    var isOk: Boolean

    // Запрашиваем товар у пользователя
    println("Всего товаров: ${productStock.values.reduce{acc, amount -> acc + amount}}")
    println("Введи название товара: ")
    val inputProduct = readlnOrNull()

    // Проверка введенных данных

    try {
        if (inputProduct != null && inputProduct.trim() != "") {
            isOk = true
        } else throw Exception("Неправильно введенное имя товара!")
    } catch (e: Exception) {
        println(e)
        e.printStackTrace()
        return
    }

    // Проверка наличия товара и скидок

    var isDiscount: Boolean = false

    try {
        if (productPrices.keys.contains(inputProduct) &&
            productStock.keys.contains(inputProduct)
        ) {
            if (discountProducts.contains(inputProduct)) {
                isDiscount = true
            }
        } else throw Exception("Нет такого товара!")
    } catch (e: Exception) {
        println("Ошибка: ${e.localizedMessage}")
        e.printStackTrace()
        return
    }

    // Ввод кол-ва товаров и покупка

    println("Введи кол-во товара для покупки: ")
    val amountToBuy: Any?

    try {
        amountToBuy = readlnOrNull()?.toInt()
        val totalPrice: Double

        if (amountToBuy != null && productStock[inputProduct] ?: 0 >= amountToBuy) {
            totalPrice = if (isDiscount) {
                amountToBuy * ((productPrices[inputProduct] ?: 0.0) * 0.8)
            } else amountToBuy * (productPrices[inputProduct] ?: 0.0)

            productStock[inputProduct] = (productStock[inputProduct] ?: 0) - amountToBuy
            orderHistory.add(inputProduct)
        } else throw Exception("Введено неверное кол-во товара!")

        if (isDiscount) println("Цена товара(ов) со скидкой: $totalPrice$")
        else println("Цена товара(ов) без скидки: $totalPrice$")
    } catch (e: Exception) {
        println("Ошибка: ${e.localizedMessage}")
        e.printStackTrace()
        return
    }

    if (productStock[inputProduct] == 0) productStock.remove(inputProduct)

    // Ввод контактной информации пользователя

    println("Введи свое имя: ")
    val userName: String? = readlnOrNull()
    var userEmail: String?

    try {
        if (userName != null && userName.trim() != "") {
            println("Введи свой email: ")
            userEmail = readlnOrNull()

            if (userEmail != null && userEmail.trim() != "") {
                customerContacts[userName] = userEmail
            } else throw Exception("Ошибка введенного Email!")
        } else throw Exception("Ошибка введенного имени!")
    } catch (e: Exception) {
        println("Ошибка ввода данных: ${e.localizedMessage}")
        e.printStackTrace()
        return
    }

    // Вывод общего кол-ва товаров и кол-во товаров со скидкой

    println("Общее кол-во товаров: ${productStock.values.reduce{acc, num -> acc + num}} товаров")
    println("Кол-во товаров со скидкой: ${discountProducts.size}")
}
