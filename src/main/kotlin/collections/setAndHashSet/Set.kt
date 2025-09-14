package collections.setAndHashSet

fun main() {
    val numbers = setOf(1, 5, 2, 1)
    println(numbers)

    val emptySet = setOf<Int>()
    println(emptySet)

    val numbers2 = setOf(1, 3, 5, 1, 5, null, 9, 87, null)
    println(numbers2)
}

/**
 * SET - IMMUTABLE - создается только 1 раз и нельзя изменить!!!
 *
 * 1) Set - хранит только уникальные элементы
 * 2) Set может хранить также Null
 * 3) Можно создать пустой Set ( val emptySet = setOf<Int>() ) но нужно указывать тип данных, которые будут
 * в нем храниться
 */
