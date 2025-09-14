package collections.listAndArrayList

fun main() {
    //  Exercise 1

    val winners = listOf("Usain", "John", "Michael", "Alex", "Bob")
    println("Michael finished on ${winners.indexOf("Michael") + 1} place")

    //  Exercise 2

    val colorsNeed = listOf("red", "green", "blue")
    val availableColors = listOf("red", "blue")

    println("Printer can print - ${availableColors.containsAll(colorsNeed)}")

    //  Exercise 3

    val ingredients = arrayListOf("Chicken", "Egg", "Mozzarella", "Pepper")
    println("Ingredients are: $ingredients")
    val index = ingredients.indexOf("Mozzarella")
    ingredients.set(index, "Blue Cheese")
    println("Ingredients are: $ingredients")

    //  Exercise 4

    val animals = arrayListOf("lion", "zebra", "chimp", "elephant")
    println("Animals: $animals")

    animals.add("panda bear cub")
    println("Refreshed list: $animals")

    animals.remove("lion")
    println("Refreshed list: $animals")

    val both = listOf("elephant", "giraffe")
    println("Does the zoo have elephant and giraffe - ${animals.containsAll(both)}")

    println()

    //  Exercise 5 "Мой первый список"

    val fruits = listOf("apple", "banana", "orange")
    val vegetables = arrayListOf<String>()

    vegetables.add("carrot")
    vegetables.add("potato")
    vegetables.add("tomato")

    println("Размер списка фруктов: ${fruits.size}")
    println("Размер списка овощей: ${vegetables.size}")
    println("Первый элемент fruits - ${fruits[0]}")
    println("Второй элемент vegetables - ${vegetables.get(1)}")
    println("Фрукты: $fruits")
    println("Овощи: $vegetables")
    println("Содержит ли fruits 'banana' - ${fruits.contains("banana")}")
    println("Содержит ли vegetables 'cucumber' - ${vegetables.contains("cucumber")}")

    println()

    //  Exercise 2 "Управление списком чисел"

    val numbers = arrayListOf<Int>()
    numbers.add(10)
    numbers.add(20)
    numbers.add(30)
    numbers.add(40)
    numbers.add(50)

    println(numbers)

    numbers.remove(30)
    numbers.removeAt(0)
    numbers.add(1, 25)
    numbers.set(2, 35)

    println(numbers)
    println(numbers.indexOf(25))
    println(numbers[numbers.lastIndex])

    println()

    //  Exercise 3 Пользовательский список

    val userInput = arrayListOf<String>()

    println("Введи слово: ")
    val word1 = readLine() ?: ""
    userInput.add(word1)
    println("Введи второе слово: ")
    val word2 = readLine() ?: ""
    userInput.add(word2)
    println("Введи третье слово: ")
    val word3 = readLine() ?: ""
    userInput.add(word3)

    println("Ты ввел: $userInput")
    println("Кол-во слов: ${userInput.size}")
    println("Пустой ли список? - ${userInput.isEmpty()}")
    println("Первое слово- ${userInput[0]}, последнее - ${userInput[userInput.lastIndex]}")

    userInput.removeAt(1)
    println("Обновленный список: $userInput")

    println()

    //  Exercise 4 "Работа с двумя списками"

    val colors1 = listOf("red", "blue", "green")
    val colors2 = listOf("blue", "yellow", "red")

    println("colors1 содержит элемент 'blue' - ${colors1.contains("blue")}")
    println("colors2 содержит элемент 'green' - ${colors2.contains("green")}")
    println("'red' в colors1 находится на позиции: ${colors1.indexOf("red")}")
    println("'red' в colors2 находится на позиции: ${colors2.indexOf("red")}")

    val combined = arrayListOf<String>()
    combined.addAll(colors1)
    combined.addAll(colors2)
    println(combined)
    println("Размер combined: ${combined.size}")

    println()

    //  Exercise 5 "Управление списком задач"

    val tasks = arrayListOf<String>()
    tasks.add("Купить хлеб")
    tasks.add("Погулять с собакой")
    tasks.add("Сделать домашку")

    println("${tasks.indexOf("Купить хлеб") + 1}. ${tasks.get(0)}")
    println("${tasks.indexOf("Погулять с собакой") + 1}. ${tasks[1]}")
    println("${tasks.indexOf("Сделать домашку") + 1}. ${tasks[2]}")

    println("Введи номер задачи для удаления (1/2/3)")
    var taskNumber: Int?

    try {
        taskNumber = (readln() ?: "").toInt()
        tasks.removeAt(--taskNumber)
    } catch (e: Exception) {
        println("Возникла ошибка: \n${e.localizedMessage}")
        e.printStackTrace()
    }

    println("Введи еще задачу: ")
    tasks.add(readLine() ?: "")

    tasks.set(0, "Проверить почту")
    println(tasks)
    println("Кол-во задач: ${tasks.size}")
    println("Первая задача: '${tasks[0]}'")
    println("Последняя задача: ${tasks[tasks.lastIndex]}")
    println("Список содержит 'почта' - ${tasks.contains("Почта")}")
}
