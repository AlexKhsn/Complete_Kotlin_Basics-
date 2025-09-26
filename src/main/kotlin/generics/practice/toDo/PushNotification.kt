package generics.practice.toDo

class PushNotification(
    title: String,
    message: String,
    timeStamp: String,
) : Notification(
        title,
        message,
        timeStamp,
    ) {
    override fun formatMessage(): String {
        return "🔔 $title\n$message"
    }

    override fun send() {
        println("Сообщение $title отправлено в Push уведомлении")
    }
}
