package collections.mapAndHashMap

fun main() {
    val count = mutableMapOf(
        1 to "one",
        2 to "two",
        3 to "three",
    )

    val count2 = mutableMapOf(
        1 to "one",
        5 to "five",
        10 to "ten",
    )

    println(count)
    println("This map has a size of ${count.size}")

    println("Does the map have the key '2': ${count.containsKey(2)}")
    println("Does the map have the key '5': ${count.containsKey(5)}")

    println("Does the map have the value 'one': ${count.containsValue("one")}")
    println("Does the map have the value 'five': ${count.containsValue("five")}")

    println("Is the map empty? : ${count.isEmpty()}")
    println("Is the map have any key value pairs?: ${count.isNotEmpty()}")

    count.putAll(count2)
    println(count)
}

/**
 *  1) .put(key, value) - добавляет пару ключ = значение в hashMap
 *  2) .putAll(value) - добавляет пары из другой map
 *  3) .remove(key) - удаляет пару по ключу key
 *  4) .replace(key, value) - заменяет значение по ключу
 *  5) .clear() - очищает map
 *  6) .size - возвращает длину (кол-во пар ключ = значение)
 *  7) .containsKey(key) - возвращает true/false если есть key
 *  8) .containsValue(value) - возвращает true/false если есть value
 *  9) .isEmpty() - возвращает true/false если map пустая/не пустая
 *  10) .isNotEmpty() - возвращает true/false если map не пустая/пустая
 */
