package generics.practice.toDo

class RecurringTask(
    title: String,
    description: String,
    status: Status,
    val interval: String,
) : Task(
        title,
        description,
        status,
    ),
    Exportable {
    fun createNext() {
        println("🔄 Создана новая повторяющаяся задача '$title' через $interval")
    }

    override fun export() {
        println("💾 Экспортируем повторяющуюся задачу '$title'")
    }
}
