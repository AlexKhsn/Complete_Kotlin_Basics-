package generics.practice

fun main() {
    val info = Info<String>()
    info.getLength("String")

    val info2 = Info<Double>()
    info2.getLength(23.324)

    val info3 = Info<MutableList<Int>>()
    info3.getLength(mutableListOf(2, 4, 23, 43, 15))

}

class Info<T> {
    fun getLength(el: T) {
        println(el.toString().length)
    }
}
