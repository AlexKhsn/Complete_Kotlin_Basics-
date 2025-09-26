package generics.practice.toDo

class EmailNotification(
    title: String,
    message: String,
    timeStamp: String,
) : Notification(
        title,
        message,
        timeStamp,
    ) {
    override fun formatMessage(): String {
        return "Subject: $title\n\nДорогой пользователь,\n$message\n\nВремя: $timeStamp"
    }

    override fun send() {
        println("Сообщение $title отправлено по Email")
    }
}
