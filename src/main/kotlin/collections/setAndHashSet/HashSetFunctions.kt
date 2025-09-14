package collections.setAndHashSet

fun main() {
    val numbers = hashSetOf(4, 3, 1)
    val newNumbers = hashSetOf(2, 3, 7, 1)

    println(numbers.intersect(newNumbers))

    numbers.clear()
    println(numbers)
    println(numbers.isEmpty())
}

/**
 * 1) .intersect(value) - сравнивает две коллекции и возвращает новую коллекцию элементов, соответствующих обеим
 * коллекциям
 * 2) .retainAll(value) - удаляет из исходной коллекции все элементы кроме общих с переданной
 * коллекцией, изменяет исходную коллекцию. Возвращает true/false
 * 3) .union() или просто union (set1 union set2) - возвращает set уникальных элементов
 * коллекций
 */
