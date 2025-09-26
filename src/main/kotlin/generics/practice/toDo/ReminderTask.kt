package generics.practice.toDo

class ReminderTask(
    title: String,
    description: String,
    status: Status,
    val reminderTime: String,
) : Task(
        title,
        description,
        status,
    ),
    Archivable,
    Exportable {
    fun showReminder() {
        println("🔔 Напоминание: '$title' в $reminderTime")
    }

    override fun archive() {
        println("📦 Архивируем задачу-напоминание '$title'")
    }

    override fun export() {
        println("💾 Экспортируем задачу '$title'")
    }
}
