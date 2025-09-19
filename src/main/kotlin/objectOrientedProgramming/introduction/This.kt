package objectOrientedProgramming.introduction

fun main() {
    val postIt = PostItNote()
    println(postIt.message)
    postIt.updateMessage("Meeting at 5")
    println(postIt.message)
    postIt.printMessage()
}

class PostItNote {
    var message = "No message"

    fun updateMessage(message: String) {
        this.message = message
    }

    fun printMessage() {
        println(message)
        println(this.message)
    }
}
