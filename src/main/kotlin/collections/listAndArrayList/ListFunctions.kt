package collections.listAndArrayList

fun main() {
    val colors = listOf("blue", "red", "blue", "green")
    println(colors.size)

    println(colors.contains("red"))
    println(colors.contains("pink"))

    val newColors1 = listOf("red", "green")
    println(colors.containsAll(newColors1))

    val newColors2 = listOf("red", "green", "pink")
    println(colors.containsAll(newColors2))

    println(colors.indexOf("blue"))
    println(colors.indexOf("red"))
    println(colors.lastIndexOf("blue"))
    println(colors.lastIndexOf("dog"))
    println(colors.indexOf("dog"))
}

/**
 * 1) .size - возвращает длинну list (кол-во элементов)
 * 2) .contains("") - возвращает true/false
 * 3) .containsAll(list) - возвращает true/false если в list есть все элементы из переданного list
 * 4) .indexOf("") - возвращает индекс первого вхождения элемента в list
 * 5) .lastIndexOf() - возвращает индекс последнего вхождения элемента в list
 * 6) Если элемента нет в list - возвращает -1ыва
 */
