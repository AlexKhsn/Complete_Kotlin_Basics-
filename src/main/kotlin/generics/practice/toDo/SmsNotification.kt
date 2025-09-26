package generics.practice.toDo

class SmsNotification(
    title: String,
    message: String,
    timeStamp: String,
) : Notification(
        title,
        message,
        timeStamp,
    ) {
    override fun formatMessage(): String {
        return "$title: $message [$timeStamp]"
    }

    override fun send() {
        println("Сообщение $title отправлено в SMS")
    }
}
