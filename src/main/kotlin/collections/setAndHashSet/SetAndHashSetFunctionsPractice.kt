package collections.setAndHashSet

fun main() {
    //  Exercise 1

    val numbers = setOf(2, 3, 4, 6, 11, 23, 34, 123, 543)
    println("21 a prime number - ${numbers.contains(21)}")
    println("13 a prime number - ${numbers.contains(11)}")

    println()

    //  Exercise 2

    val myFavDrinks = hashSetOf("water", "coke", "beer", "juice")
    val parFavDrinks = hashSetOf("water", "juice", "tea", "milk")

    println(myFavDrinks.intersect(parFavDrinks))
    println(myFavDrinks)

    myFavDrinks.retainAll(parFavDrinks)
    println(myFavDrinks)

    println()

    //  Exercise 3

    val acceptColors = hashSetOf("white", "black", "grey")
    val myColors = hashSetOf("blue", "red", "black", "green")

    println("I can dress: ${acceptColors.intersect(myColors)}")

    acceptColors.add("red")

    println("Now i can dress: ${acceptColors.intersect(myColors)}")

    println()

    //  Exercise 4

    val colors = setOf("red", "green", "blue")
    val fruits = hashSetOf<String>()
    val toAdd = listOf("apple", "banana", "apple")

    fruits.addAll(toAdd)

    println(colors)
    println(fruits)

    println("red в colors - ${colors.contains("red")}")
    println("yellow в colors - ${colors.contains("yellow")}")
    println("apple в fruits - ${fruits.contains("apple")}")
    println("fruits пустой? - ${fruits.isEmpty()}")

    fruits.remove("banana")
    println(fruits)

//    colors.clear() - не получится очистить, так как он immutable

    println()

    //  Exercise 5 "Операции с множествами"

    val set1 = hashSetOf(1, 2, 3, 4, 5)
    val set2 = hashSetOf(4, 5, 6, 7, 8)
    val commonUnique = hashSetOf<Int>()
    commonUnique.addAll(set1)
    commonUnique.addAll(set2)
    val difSet = hashSetOf<Int>()
    difSet.addAll(set1)
    difSet.removeAll(set2)
    println("Общие элементы: ${set1.intersect(set2)}")
    println("Объединение уникальных элементов: $commonUnique")
    println("Разность уникальных элементов: $difSet")

    val result = hashSetOf<Int>()
    result.addAll(set1.intersect(set2))
    result.add(10)
    result.remove(4)

    println("result: $result, кол-во элементов: ${result.size}")

    println()

    //  Exercise 6 "Пользовательские множества"

    val userWords = mutableSetOf<String>()
    println("Введи первое слово: ")
    val word1 = readLine() ?: ""
    userWords.add(word1)
    println("Введи второе слово: ")
    val word2 = readLine() ?: ""
    userWords.add(word2)
    println("Введи третье слово: ")
    val word3 = readLine() ?: ""
    userWords.add(word3)
    println("Введи первое слово заново: ")
    val word4 = readLine() ?: ""
    userWords.add(word4)

    println("Слова: $userWords, кол-во слов: ${userWords.size}")

    val bannedWords = mutableSetOf("плохо", "ужасно")
    userWords.removeAll(bannedWords)
    println("'хорошо в userWords - ${userWords.contains("хорошо")}'")
    println(userWords)

    println()

    //  Exercise 7 "Анализ уникальности"

    val group1 = mutableSetOf("Alice", "Bob", "Charlie")
    val group2 = mutableSetOf("Bob", "David", "Eve")
    val group3 = mutableSetOf("Charlie", "Eve", "Frank")
    val allPeople = mutableSetOf<String>()
    allPeople.addAll(group1)
    allPeople.addAll(group2)
    allPeople.addAll(group3)

    val onlyInGroup1 = mutableSetOf<String>()
    onlyInGroup1.addAll(group1)
    onlyInGroup1.removeAll(group2)
    onlyInGroup1.removeAll(group3)

    println("Совпадение во всех: ${group1.intersect(group2).intersect(group3)}")
    println("Только в первой группе: $onlyInGroup1")
    println("Общее количество уникальных людей во всех группах: ${allPeople.size}")

    println("Введи имя человека: ")
    val check = readLine() ?: ""
    println("$check есть в allPeople - ${allPeople.contains(check)}")

    println("$check состоит в group1 - ${group1.contains(check)}")
    println("$check состоит в group2 - ${group2.contains(check)}")
    println("$check состоит в group3 - ${group3.contains(check)}")

    group1.remove(check)
    group2.remove(check)
    group3.remove(check)

    println("group1: $group1")
    println("group2: $group2")
    println("group3: $group3")
}
