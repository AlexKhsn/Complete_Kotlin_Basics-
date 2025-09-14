package collections.listAndArrayList

fun main() {
    var colors: ArrayList<String> = arrayListOf("blue", "red")
    println(colors)

    var noColors = arrayListOf<String>()
    println(noColors)

    colors.add("yellow")
    println(colors)

    val moreColors = arrayListOf("pink", "orange")
    colors.addAll(moreColors)
    println(colors)

    colors.remove("red")
    println(colors)

    colors.removeAll(moreColors)
    println(colors)

    colors.removeAt(1)
    println(colors)

    colors.add("red")
    colors.add("blue")

    colors.remove("blue")

    println(colors)
}

/**
 * 1) ArrayList - MUTABLE - может быть изменен после создания (добавлены или удалены элементы)
 * 2) Можно создать пустой arrayList, но необходимо указать тип данных, которые будут храниться в нем
 * ( val colors = arrayListOf<String>() )
 * 3) Для работы с arrayList используются следующие методы:
 *    --- .add("") - добавляет элемент
 *    --- .addAll(arrayList) - добавляет элементы из другого arrayList
 *    --- .remove("") - удаляет указанный элемент
 *    --- .removeAt(index) - удаляет элемент по указанному индексу
 *    --- .removeAll(arrayList) - удаляет элементы, содержащиеся в указанном arrayList
 *  4) Если arrayList сожержит дубликаты, то .remove("") удалит первый из них (поиск идет сначала и в конец)
 */
