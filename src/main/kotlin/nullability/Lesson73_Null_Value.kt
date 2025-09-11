package nullability

fun main(Args: Array<String>) {
    val herName: String = "Lilly"
    val hisName: String? = null

    println(herName)
    println(hisName)

    var catName: String? = "Cat"
    catName = null

    var dogName: String = "Dog"
//    dogName = null

    var number = 20
//    number = null

    var text: String?
    text = "sdfsdf"
    text = null

    var text2 = "sdsdf"
//    text2 = null

    // Переменные могут быть nullable и no-nullable.
    // Nullable можно присвоить значение null
    // No-nullable - нельзя присвоить значение null - ОШИБКА!
    // Если переменная инициализированна null, то присвоить ей какое-либо другое значение - НЕЛЬЗЯ!

    // Оператор "?" указанный после типа данных переменной указывает на то, что переменная - nullable, ей может быть присвоено значение null.
}
