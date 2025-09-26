package generics.practice.library

class TextBook(
    title: String,
    author: String,
    pages: Int,
    val subject: String,
) : Book(
        title,
        author,
        pages,
    ),
    Studiable,
    Notable {
    override fun displayInfo() {
        super.displayInfo()
        println("Предмет: $subject")
    }

    override fun study() {
        println("Изучаю учебник '$title' по '$subject'")
    }

    override fun makeNote(note: String) {
        println("Делаю заметку в учебнике по $subject : '$note'")
    }
}
