package objectOrientedProgramming.principlesOfOOP.encapsulationAndScope.practice.practiceBank

class BankSafe {
    private val items = mutableListOf("gun", "cash", "gold", "whore", "jewellery")
    private val privateKey = 12345
    private var isLocked = true
    private val log = mutableListOf<String>()

    fun unlock(publicKey: Int) {
        if (publicKey == privateKey) {
            println("Сейф открыт")
            log.add("Открытие сейфа")
            isLocked = false
        } else {
            println("Неправильный ключ!")
            log.add("Неудачное открытие сейфа")
        }
    }

    fun checkItems() {
        if (!isLocked) {
            log.add("Удачный просмотр")
            println("Список предметов: ")
            for (i in 0..items.size - 1) {
                println("${i + 1}) ${items[i]}")
            }
        } else {
            log.add("Неудачный просмотр")
            println("Сейф закрыт!")
        }
    }

    fun addItem(item: String) {
        if (!isLocked) {
            items.add(item)
            println("$item теперь в сейфе!")
            log.add("Удачное добавление - $item")
        } else {
            log.add("Неудачно добавление $item - сейф закрыт")
            println("Нельзя добавить предмет не открыв сейф!")
        }
    }

    fun takeItem(item: String) {
        if (!isLocked) {
            if (items.contains(item)) {
                items.remove(item)
                println("$item был забран из сейфа!")
                log.add("Удачный отбор - $item")
            } else {
                println("В сейфе такого нет!")
                log.add("Неудачный отбор - $item")
            }
        } else {
            println("Что бы забрать что-то - открой сейф!")
            log.add("Неудачный отбор $item - сейф закрыт")
        }
    }
}
