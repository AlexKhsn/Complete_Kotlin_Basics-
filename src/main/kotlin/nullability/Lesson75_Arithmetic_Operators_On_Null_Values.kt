package nullability

fun main(args: Array<String>) {
    val a: Int? = 10

//    println(a + 3)                                ------- ОШИБКА! Математические действия с nullable-переменной возможны только через методы

    println(a?.plus(3)) // ---- СЛОЖЕНИЕ --------- ?.plus()
    println(a?.minus(3)) // ---- ВЫЧИТАНИЕ --------- ?.minus()
    println(a?.times(3)) // ---- УМНОЖЕНИЕ --------- ?.times()
    println(a?.div(3)) // ---- ДЕЛЕНИЕ --------- ?.div()
    println(a?.rem(3)) // ---- ОСТАТОК ОТ ДЕЛЕНИЯ --------- ?.rem()

    println()

    // ---- Математические действия с null дают null

    val b: Int? = null
    val c = 4

    println(b?.plus(c))
    println(b?.times(c))
    println(b?.div(c))
    println(b?.rem(c))
    println(b?.minus(c))
}
