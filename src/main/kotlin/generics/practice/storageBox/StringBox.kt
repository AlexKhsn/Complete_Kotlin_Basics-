package generics.practice.storageBox

class StringBox(var box: String? = null) {
    fun put(item: String) {
        println("$item положили в коробку")
        box = item
    }

    fun get(): String? = box

    fun isEmpty(): Boolean = box == null
}
