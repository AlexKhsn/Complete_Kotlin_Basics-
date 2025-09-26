package generics.practice.toDo

open class Task(val title: String, val description: String, var status: Status) {
    fun displayInfo() {
        println("===Задача===")
        println("Название: $title")
        println("Описание: $description")
        println("Статус: $status")
        println()
    }

    fun markCompleted() {
        status = Status.DONE
    }
}
