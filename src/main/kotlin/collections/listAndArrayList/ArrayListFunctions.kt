package collections.listAndArrayList

fun main() {
    val colors = arrayListOf("blue", "red", "blue", "green")
    colors.set(1, "orange")
    println(colors)

    val subColors = colors.subList(1, 3)
    println(subColors)
    println(subColors::class.java)

    colors.clear()
    println(colors)

    println(colors.isEmpty())
}

/**
 * 1) .set(index, "") - заменяет элемент с indexом на указанный элемент
 * 2) .subList(startIndex, endIndex) - копирует arrayList начаиная с startIndex и по endIndex, не включая его!
 * 3) .clear() - очищает arrayList и удаляет из него все элементы
 * 4) .isEmpty() - возвращает true/false если массив пустой/не пустой
 */
