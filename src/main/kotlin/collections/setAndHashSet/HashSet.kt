package collections.setAndHashSet

fun main() {
    val numbers = hashSetOf(1, 23, null, 1, 6, 26, null)
    val emptyHashSet = hashSetOf<Int>()

    println(numbers)
    println(emptyHashSet)

    numbers.add(23)
    numbers.add(87)
    println(numbers)

    val newNumbers = setOf(23, 65, 23, 3, 54, null, 34)
    numbers.addAll(newNumbers)
    println(numbers)

    numbers.remove(54)
    println(numbers)

    val toRemove = setOf(23, null, 3, 2345)
    numbers.removeAll(toRemove)
    println(numbers)
}

/**
 * HASHSET - MUTABLE - можно изменить в последствии (добавить или удалить/изменить элементы)
 */
