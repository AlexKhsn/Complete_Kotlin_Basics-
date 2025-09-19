package objectOrientedProgramming.introduction.practice

fun main() {
    val book = Book(Book.getEditor())
    println(book.editor.editorName)
}

class Book(val editor: Editor) {
    companion object {
        fun getEditor() = Editor("Rowling")
    }
}

class Editor(val editorName: String)
