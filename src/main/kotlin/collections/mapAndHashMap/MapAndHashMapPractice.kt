package collections.mapAndHashMap

fun main() {
    //  Exercise 1

    var count = mutableMapOf(
        1 to "un",
        2 to "deux",
        3 to "trois",
    )

    println("2 will be translated as - '${count[2]}'")
    println("2 will be translated as - '${count.get(2)}'")

    println("3 will be translated as - '${count[3]}'")

    count.put(4, "quatre")
    println(count)

    println()

    //  Exercise 2

    var customers = mapOf(
        "John" to 1,
        "Alice" to 5,
        "Bob" to 3,
    )

    println("Alice is a customer - ${customers.containsKey("Alice")}. She bought: ${customers["Alice"]} products")
    println("Michael is a customer - ${customers.containsKey("Michael")}. He bought: ${customers["Michael"]} products")

    println()

    //  Exercise 3

    var attendence = mutableMapOf(
        "23 Sept" to 2837,
        "24 Sept" to 3726,
        "25 Sept" to 6253,
    )

    attendence.put("26 Sept", 3421)

    val visitors25 = attendence["25 Sept"] ?: 0
    val visitors26 = attendence["26 Sept"] ?: 0

    println("In 25 and 26 of Sept totally visited ${visitors25 + visitors26}")
    println("Is data for 22 Sept available? - ${attendence.containsKey("22 Sept")}")

    println()

    //  Exercise 4 "Знакомство с Map

    val ages = mapOf(
        "Alice" to 25,
        "Bob" to 30,
        "Charlie" to 35,
    )

    val countries = mutableMapOf<String, String>()
    val toAdd = mapOf(
        "Alice" to "USA",
        "Bob" to "Canada",
        "David" to "UK",
    )

    countries.putAll(toAdd)

    println(ages)
    println(countries)
    println("Alice is ${ages["Alice"]} years old")
    println("Bob is from the '${countries["Bob"]}'")
    println("'countries' содержит - ${countries.size} пар, 'ages' - ${ages.size}")
    println("ages содержит ключ 'Charlie' - ${ages.containsKey("Charlie")}")
    println("countries содержит значение 'Germany' - ${countries.containsValue("Germany")}")
    println("Пустой ли ages - ${ages.isEmpty()}")

    println()

    //  Exercise 5 "Управление словарём"

    val prices = mutableMapOf<String, Double>()
    val pricesToAdd = mapOf(
        "apple" to 1.5,
        "banana" to 0.8,
        "orange" to 2.0,
    )

    prices.putAll(pricesToAdd)
    prices.replace("banana", 1.0)
    prices["banana"] = 1.0 // or this variant
    prices.put("grape", 3.5)
    prices["grape"] = 3.5 // or this variant
    val kiwiPrice = prices["kiwi"]
    prices.remove("orange")
    println(prices.keys)
    println(prices.values)
    prices.clear()
    println("prices пустой? - ${prices.isEmpty()}")

    println()

    //  Exercise 6 "Телефонная книга"

    val phoneBook = mutableMapOf<String, String>()
    var userInput1: Any
    var userInput2: Any
    var userInput3: Any

    try {
        println("Введи имя первого контакта и его телефон (через пробел)")
        userInput1 = (readLine() ?: "").split(" ")
        phoneBook[userInput1[0]] = userInput1[1]

        println("Введи имя второго контакта и его телефон (через пробел)")
        userInput2 = (readLine() ?: "").split(" ")
        phoneBook[userInput2[0]] = userInput2[1]

        println("Введи имя третьего контакта и его телефон (через пробел)")
        userInput3 = (readLine() ?: "").split(" ")
        phoneBook[userInput3[0]] = userInput3[1]

        println(phoneBook)

        println("Введи имя для поиска: ")

        val searchName = readLine() ?: ""

        if (phoneBook.containsKey(searchName)) {
            println("Телефон контакта '$searchName': ${phoneBook[searchName]}")
        } else {
            throw Exception("Контакт не найден!")
        }

        phoneBook.remove(userInput2[0])
    } catch (e: Exception) {
        println("Ошибка: ${e.localizedMessage}")
        e.printStackTrace()
    }

    println(phoneBook)
    println("В телефонной книге: ${phoneBook.size} контакта")

    println()

    //  Exercise 7 "Инвентарь товаров"

    val inventory = mutableMapOf(
        "laptop" to 5,
        "mouse" to 20,
        "keyboard" to 15,
    )

    val gadgetsPrices = mutableMapOf(
        "laptop" to 999.99,
        "mouse" to 25.50,
        "keyboard" to 89.90,
    )

    println("Введи название товара: ")
    val search = readln() ?: ""

    if (inventory.containsKey(search) && gadgetsPrices.containsKey(search)) {
        println("'$search' ----- Кол-во: ${inventory[search]}, Цена: ${gadgetsPrices[search]}")
    }

    println("Сколько хочешь?")
    val toBuy = (readln() ?: "").toInt()

    try {
        if (inventory[search]!! >= toBuy) {
            inventory[search] = inventory[search]!!.toInt() - toBuy
            println("Стоимость покупки: ${gadgetsPrices[search]!! * toBuy}")
        } else {
            throw Exception("Товара нет")
        }
    } catch (e: Exception) {
        println("Ошибка: ${e.localizedMessage}")
        e.printStackTrace()
    }

    println(inventory)

    inventory["webcam"] = 8
    gadgetsPrices["webcam"] = 150.0

    println(inventory)
    println(gadgetsPrices)
}
