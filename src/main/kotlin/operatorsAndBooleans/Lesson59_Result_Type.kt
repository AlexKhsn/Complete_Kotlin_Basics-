package operatorsAndBooleans

fun main(args: Array<String>) {
    val a: Short = 6
    val b: Int = 32 // РЕЗУЛЬТАТ - Int, ТАК КАК Int БОЛЬШЕ Short
    val result = a * b
    println(result::class.java)

    println()

    val c: Long = 2376283763782
    val d: Float = 13.67F
    val result2 = c / d // РЕЗУЛЬТАТ - Float, ТАК КАК Float БОЛЬШЕ Long
    println(result2::class.java)

    println()

    val e: Float = 19.6F
    val f: Double = 23.2321 // РЕЗУЛЬТАТ - Double, ТАК КАК Double БОЛЬШЕ Float
    val result3 = e * f
    println(result3::class.java)

    println()

//    val g: String = "string"
//    val h: Int = 34
//    val result4 = g / h                       МАТЕМАТИЧЕСКИЕ ОПЕРАЦИИ ВОЗМОЖНЫ ТОЛЬКО МЕЖДУ ЧИСЛАМИ, КРОМЕ "+" - ОН ВЫПОЛНЯЕТ КОНКАТЕНАЦИЮ
//    println(result4)                          ТИПЫ НЕ ПРИВОДЯТСЯ АВТОМАТИЧЕСКИ!
//    println(result4::class.java)

    val g: String = "12312"
    val h: Int = 34
    val result4 = g.toInt() + h //  СТРОКУ СОДЕРЖАЩУЮ ЧИСЛО МОЖНО ПРИВЕСТИ К ЧИСЛУ И ВЫПОЛНИТЬ МАТЕМАТИЧЕСКУЮ ОПЕРАЦИЮ
    println(result4)
    println(result4::class.java)
}
