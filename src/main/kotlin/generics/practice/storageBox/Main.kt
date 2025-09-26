package generics.practice.storageBox

fun main() {
    val stringBox = Box<String>()
    val stringBox2 = Box<String>()
    val intBox = Box<Int>()
    val intBox2 = Box<Int>()
    val booleanBox = Box<Boolean>()

    stringBox.put("Телефон")
    intBox.put(23)
    intBox2.put(57)
    booleanBox.put(true)

    moveItem(stringBox, stringBox2)

    println("В первой коробке: ${stringBox.get()}")
    println("Во второй коробке: ${stringBox2.get()}")

    stringBox.put("Динозавр")
    println("При сравнении больше коробка: ${findBigger(stringBox, stringBox2)}")
    println("Сравнил $intBox и $intBox2, больше ${findBigger(intBox, intBox2)}")
}

fun <T> moveItem(from: Box<T>, to: Box<T>) {
    val item = from.get()
    if (item != null) {
        to.put(item)
        from.clear()
        println("Переместили: $item")
    }
}

fun <T : Comparable<T>> findBigger(box1: Box<T>, box2: Box<T>): Box<T>? {
    val item1 = box1.get()
    val item2 = box2.get()

    if (item1 != null && item2 != null) {
        if (item1 > item2) return box1
        else return box2
    }

    return null
}
