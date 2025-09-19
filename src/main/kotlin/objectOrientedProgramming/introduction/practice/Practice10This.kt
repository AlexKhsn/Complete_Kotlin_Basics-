package objectOrientedProgramming.introduction.practice

fun main() {
    val table = NewTable()
    table.showInfo()

    println()

    table.update(200, "big")
    table.showInfo()

    println()

    table.update(140, "medium")
    table.showInfo()
}

class NewTable {
    var height = 100
    var size = "small"

    fun update(height: Int, size: String) {
        this.height = height
        this.size = size
    }

    fun showInfo() {
        println("Table's height: $height")
        println("Table's size: '$size'")
    }
}
