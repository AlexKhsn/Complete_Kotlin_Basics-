package generics.practice.storageBox

class IntBox(var box: Int? = null) {
    fun put(item: Int) {
        println("$item положили в коробку")
        box = item
    }

    fun get(): Int? = box

    fun isEmpty(): Boolean = box == null
}
