package objectOrientedProgramming.introduction.practice

fun main() {
    val box = Box()
    println("Content: '${box.content}'")

    box.updateContent("Something new!")
    println("Content: '${box.content}'")
}

class Box {
    var content = "No content yet..."

    fun updateContent(content: String) {
        this.content = content
    }
}
