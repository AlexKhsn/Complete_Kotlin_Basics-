package generics.practice.toDo

fun main() {
    val task1 = Task(
        "Полить цветы",
        "Нужно полить все цветы",
        Status.TODO,
    )

    val task2 = Task(
        "Выгулять собаку",
        "Нужно выгулять Шарика",
        Status.IN_PROGRESS,
    )

    val urgentTask = UrgentTask("Оплатить счета", "Счет за электричество", Status.REVIEW, "завтра")
    val recurringTask = RecurringTask("Зарядка", "Утренняя зарядка", Status.CANCELLED, "каждый день")
    val reminderTask = ReminderTask("Встреча", "Встреча с клиентом", Status.DONE, "14:00")

    archiveCompleted(
        listOf<Archivable>(
            urgentTask,
            reminderTask,
        ),
    )

    exportImportant(
        listOf<Exportable>(
            recurringTask,
            reminderTask,
        ),
    )

    val user1 = User("Alex", "alex@mail.com", 5)
    val user2 = User("Alex", "alex@mail.com", 5)

    println(user1 == user2)
    println(user1)
    val user3 = user1.copy(taskCount = 10)

    println(user1.taskCount)
    println(user3.taskCount)

    val tasks = mutableListOf<Task>()

    UrgentTask(
        "Купить хлеб",
        "Нужно купить хлеб",
        Status.IN_PROGRESS,
        "сегодня",
    ).apply {
        displayInfo()
        checkDeadline()
        archive()
        tasks.add(this)
    }

    println(tasks)

    User(
        "Alex",
        "alex@alex.com",
        5,
    ).apply {
        println(this)
        val copy = this.copy(taskCount = 15)
        println(copy)
    }

    val email = EmailNotification("Новая задача", "Проверьте список дел", "10:30")
    val sms = SmsNotification("Напоминание", "Встреча через час", "14:00")
    val push = PushNotification("Уведомление", "Задача выполнена", "15:45")

    formatAndSendAll(listOf(email, sms, push))
}

fun archiveCompleted(tasks: List<Archivable>) {
    tasks.forEach { it.archive() }
}

fun exportImportant(tasks: List<Exportable>) {
    tasks.forEach { it.export() }
}

fun formatAndSendAll(notifications: List<Notification>) {
    notifications.forEach {
        println(it.formatMessage())
        println(it.send())
    }
}
