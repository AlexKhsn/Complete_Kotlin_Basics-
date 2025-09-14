package collections.listAndArrayList

fun main() {
    val colors = listOf("blue", "red", "yellow")
    println(colors)

    val colors2 = listOf<String>()
    println(colors2)

    val colors3 = listOf("blue", "red", "blue", "green", "blue")
    println(colors3)

    val colors4 = listOf("blue", "red", "blue", null, "yellow", null, "blue")
    println(colors4)

    println(colors[0])
//    println(colors[5])

    println(colors.get(1))

    println(colors3.size)
}

/**
 * 1) List - IMMUTABLE - его можно создать 1 раз, но нельзя изменить (добавить элементы, удалить элементы)
 * 2) List - структура для упорядоченного хранения данных
 * 3) List - может содержать элементы одного типа (все элементы относятся к одному типу данных) и Null
 * 4) Все элементы в List имеют индекс по которому к ним можно получить доступ с помощью "[]" или же с помощью
 * метода .get(index)
 * 5) При создании пустого List нужно указывать тип данных, которые будут храниться в нем
 * (val colors2 = listOf<String>())
 * 6) Получить длину list -> .size
 */
