package collections.mapAndHashMap

fun main() {
    val count = mapOf(
        Pair(1, "One"),
        Pair(2, "Two"),
        Pair(3, "Three"),
    )
    println(count)

    val emptyMap = mapOf<Int, String>()
    println(emptyMap)

    println(count.get(2))
    println(count[2])

    println(count.keys)

    println(count.values)
}

/**
 * MAP - IMMUTABLE - нельзя изменить (добавить/удалить)
 * 1) map включает пары ключ = значение
 * 2) Ключи в map представлены как Set. Они УНИКАЛЬНЫ!
 * 3) Значения в map представлены как List. Они могут повторяться
 *
 * При создании пустого map нужно указывать тип и для ключей, и для значений
 * val count = mapOf<Int, String>()
 *
 * При создании map указывается пара(ключ, значение)
 * vak count = mapOf(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"))
 *
 *
 * Для получения значения по ключу используют
 * 1) .get(key) - возвращает значение по key
 * 2) [key] - возвращает значение по key (НЕ ИНДЕКС!!!)
 *
 * Для получения Set ключей используем
 * 1) .keys - возвращает Set ключей
 *
 * Для получения коллекции значений используем
 * 1) .values - возвращает коллекцию значений
 */
