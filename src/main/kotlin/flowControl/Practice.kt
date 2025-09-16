package flowControl

fun main() {
    // Exercise 1 "Анализ оценок студентов"

    val studentGrades = listOf(85, 92, 76, 88, 95, 67, 73, 91, 84, 79)
    val studentNames = listOf("Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Henry", "Ivy", "Jack")
    var higher80Counter = 0
    var highestGrade = 0
    val less75Names = mutableListOf<String>()

    for (i in studentGrades.indices) {
        val grade = studentGrades[i]
        val name = studentNames[i]

        println("$name: $grade")
        if (grade < 75) less75Names.add(name)
        if (grade > 80) higher80Counter++
        if (grade > highestGrade) highestGrade = grade
    }

    println()

    if (!less75Names.isEmpty()) {
        println("Студенты получившие меньше 75: ")

        for (name in less75Names) println(name)
    }
    println("$higher80Counter студентов получили больше 80")
    println("Наивысшая оценка: $highestGrade")

    println()

    // Exercise 2 "Поиск товаров в магазине"

    val products = listOf("laptop", "mouse", "keyboard", "monitor", "speaker", "webcam", "tablet", "phone")
    val prices = listOf(999.99, 25.50, 89.90, 299.99, 150.00, 75.50, 399.99, 799.99)

    println("Введи макс цену для поиска: ")
    val maxPrice = (readln() ?: "").toDouble()
    val cheapProducts = mutableListOf<String>()
    var cheapPricesSum = 0.0

    for (i in prices.indices) {
        if (cheapProducts.size == 3) {
            println("Кол-во найденных товаров 3. Поиск завершен!")
            break
        }

        val price = prices[i]
        val name = products[i]

        if (price <= maxPrice) {
            println(name)
            cheapProducts.add(name)
            cheapPricesSum += price
        }
    }

    if (cheapProducts.isEmpty()) println("Товаров дешевле $maxPrice$ не найдено!")
    println("Общая стоимость найденных товаров: $cheapPricesSum$")

    println()

    // Exercise 3 "Игра в угадывание числа"

    val secretNumber = 42
    var counter = 0
    var isFinished = false

    while (true) {
        println("Введи число: ")
        try {
            val number = (readln() ?: "0").toInt()
            var answer = ""
            counter++

            if (number < secretNumber) {
                answer = "Слишком маленькое число"
            } else if (number > secretNumber) {
                answer = "Слишком больше число"
            } else {
                answer = "Поздравляю, угадал!"
                isFinished = true
            }

            println(answer)
            if (isFinished) break
        } catch (e: Exception) {
            println("Введенное значение не число!")
            continue
        }
    }

    println("Кол-во попыток: $counter")

    println()

    // Exercise 4 "Обработка списка заказов"

    val orders =
        listOf("pending", "shipped", "delivered", "cancelled", "pending", "shipped", "delivered", "pending", "cancelled", "shipped")
    val orderIds = listOf(1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010)
    var pendingCounter = 0
    var shippedCounter = 0
    var deliveredCounter = 0
    var cancelledCounter = 0

    for (i in orders.indices) {
        val name = orders[i]
        val id = orderIds[i]

        when (name) {
            "pending" -> pendingCounter++
            "shipped" -> shippedCounter++
            "delivered" -> deliveredCounter++
            "cancelled" -> cancelledCounter++
        }

        if (name == "cancelled") continue
        var message = "Заказ $id: $name"
        if (name in listOf("pending", "shipped")) message += " ⏳"

        println(message)
    }

    println()

    println("pending: $pendingCounter заказов")
    println("shipped: $shippedCounter заказов")
    println("delivered: $deliveredCounter заказов")
    println("cancelled: $cancelledCounter заказов")
    println("Общее кол-во активных заказов: ${pendingCounter + shippedCounter + deliveredCounter}")

    println()

    // Exercise 5 "Меню ресторана с фильтрацией"

    val dishes = listOf("pizza", "burger", "salad", "soup", "pasta", "steak", "fish", "chicken")
    val dishesPrices = listOf(12.50, 8.90, 6.50, 5.90, 11.00, 18.90, 15.50, 13.90)
    val categories = listOf("italian", "american", "healthy", "comfort", "italian", "grill", "grill", "grill")
    val isVegetarian = listOf(true, false, true, true, true, false, false, false)

    do {
        println(
            """
            Выбери действие:

            1 = Показать все блюда
            2 = Показать только вегетарианские блюда
            3 = Фильтр по категории
            4 = Фильтр по цене
            0 = Выход
        """,
        )

        val choose = (readln() ?: "0").toInt()

        when (choose) {
            0 -> break
            1 -> println(dishes)
            2 -> {
                for (i in 0..dishes.size - 1) {
                    if (isVegetarian[i]) {
                        print("${dishes[i]}\t")
                    }
                }
            }
            3 -> {
                println(
                    """
                    Выбери категорию:

                    1 = итальянские блюда
                    2 = американски блюда
                    3 = правильное питание
                    4 = комфорт
                    5 = гриль
                """,
                )

                val choose2 = (readLine() ?: "0").toInt()

                when (choose2) {
                    1 -> {
                        for (i in 0..dishes.size - 1) {
                            if (categories[i] == "italian") print("${dishes[i]}\t")
                        }
                    }
                    2 -> {
                        for (i in 0..dishes.size - 1) {
                            if (categories[i] == "american") print("${dishes[i]}\t")
                        }
                    }
                    3 -> {
                        for (i in 0..dishes.size - 1) {
                            if (categories[i] == "healthy") print("${dishes[i]}\t")
                        }
                    }
                    4 -> {
                        for (i in 0..dishes.size - 1) {
                            if (categories[i] == "comfort") print("${dishes[i]}\t")
                        }
                    }
                    5 -> for (i in 0..dishes.size - 1) {
                        if (categories[i] == "grill") print("${dishes[i]}\t")
                    }
                }
            }
            4 -> {
                println("Введи максимальную цену: ")
                val maxPrice = (readln() ?: "0.0").toDouble()

                for (i in 0..dishes.size - 1) {
                    if (dishesPrices[i] <= maxPrice) print("${dishes[i]}\t")
                }
            }
        }
    } while (true)
}
