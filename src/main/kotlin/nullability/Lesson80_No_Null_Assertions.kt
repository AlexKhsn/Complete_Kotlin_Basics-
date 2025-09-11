package nullability

fun main(args: Array<String>) {
    var catName: String? = null
    catName = "Cat's name"
    println(catName!!.length)
}

// ИСПОЛЬЗОВАТЬ ОПЕРАТОР "!!" ТОЛЬКО ЕСЛИ УВЕРЕН ЧТО ЗНАЧЕНИЕ НЕ Null, ИНАЧЕ БУДЕТ ОШИБКА И ПРОГРАММА НЕ БУДЕТ РАБОТАТЬ
