package generics.practice.toDo

class UrgentTask(
    title: String,
    description: String,
    status: Status,
    val deadline: String,
) : Task(
        title,
        description,
        status,
    ),
    Archivable,
    Notifiable {
    fun checkDeadline() {
        println("⚠️ Срочная задача '$title' до $deadline")
    }

    override fun archive() {
        println("📦 Архивируем срочную задачу '$title'")
    }

    override fun sendNotification() {
        println("📧 Уведомление о срочной задаче '$title'")
    }
}
