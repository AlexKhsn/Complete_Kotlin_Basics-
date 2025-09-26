package generics.practice.storageBox

class BooleanBox(var box: Boolean? = null) {
    fun put(item: Boolean) {
        println("$item положили в коробку")
        box = item
    }

    fun get(): Boolean? = box

    fun isEmpty(): Boolean = box == null
}
