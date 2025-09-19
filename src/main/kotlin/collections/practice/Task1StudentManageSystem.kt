package collections.practice

fun main() {
    //  Exercise 1 "Система управления студентами"

    val studentsGrades = mutableMapOf<String, Int>()
    val enrolledStudents = mutableSetOf<String>()
    val attendanceList = mutableListOf<String>()
    val studentsEmails = mutableMapOf<String, String>()

    println("Добавить нового студента: ")

    var inputName1: String?
    var inputEmail1: String?
    var inputGrade1: Int?
    var inputName2: String?
    var inputEmail2: String?
    var inputGrade2: Int?
    var inputName3: String?
    var inputEmail3: String?
    var inputGrade3: Int?
    var searchName: String?

    //  Проверка ввода данных студентов

    try {
        /**
         * Проверка ввода имени, email и оценки первого студента
         */

        println("Введи имя первого студента: ")
        inputName1 = readlnOrNull()

        if (inputName1 != null && inputName1.trim() != "") {
            enrolledStudents.add(inputName1)
            attendanceList.add(inputName1)
        } else {
            throw Exception("Ошибка ввода имени!")
        }

        println("Введи email первого студента: ")
        inputEmail1 = readlnOrNull()

        if (inputEmail1 != null && inputEmail1.trim() != "") {
            studentsEmails[inputName1] = inputEmail1
        } else {
            throw Exception("Ошибка ввода email!")
        }

        println("Введи оценку первого студента: ")

        try {
            inputGrade1 = readLine()?.toIntOrNull()

            if (inputGrade1 != null) {
                studentsGrades[inputName1] = inputGrade1
            } else {
                throw Exception("Ошибка ввода оценки!")
            }
        } catch (e: Exception) {
            throw e
        }

        /**
         * Проверка ввода имени, email и оценки второго студента
         */

        println("Введи имя второго студента: ")
        inputName2 = readlnOrNull()

        if (inputName2 != null && inputName2.trim() != "") {
            enrolledStudents.add(inputName2)
            attendanceList.add(inputName2)
        } else {
            throw Exception("Ошибка ввода имени!")
        }

        println("Введи email второго студента:")
        inputEmail2 = readlnOrNull()

        if (inputEmail2 != null && inputEmail2.trim() != "") {
            studentsEmails[inputName2] = inputEmail2
        } else {
            throw Exception("Ошибка ввода email!")
        }

        println("Введи оценку второго студента")

        try {
            inputGrade2 = readLine()?.toIntOrNull()

            if (inputGrade2 != null) {
                studentsGrades[inputName2] = inputGrade2
            } else {
                throw Exception("Ошибка ввода оценки!")
            }
        } catch (e: Exception) {
            throw e
        }

        /**
         * Проверка ввода имени, email и оценки третьего студента
         */

        println("Введи имя третьего студента: ")
        inputName3 = readLine()

        if (inputName3 != null && inputName3.trim() != "") {
            enrolledStudents.add(inputName3)
            attendanceList.add(inputName3)
        } else {
            throw Exception("Ошибка ввода имени!")
        }

        println("Введи email третьего студента: ")
        inputEmail3 = readLine()

        if (inputEmail3 != null && inputEmail3.trim() != "") {
            studentsEmails[inputName3] = inputEmail3
        } else {
            throw Exception("Ошибка ввода email!")
        }

        println("Введи оценку третьего студента:")

        try {
            inputGrade3 = readLine()?.toIntOrNull()
            if (inputGrade3 != null) {
                studentsGrades[inputName3] = inputGrade3
            } else {
                throw Exception("Ошибка ввода оценки!")
            }
        } catch (e: Exception) {
            throw e
        }
    } catch (e: Exception) {
        println("Ошибка ввода:  ${e.localizedMessage}")
        e.printStackTrace()
        return
    }

    println()

    //  Поиск студента по имени

    try {
        println("Введи имя для поиска: ")
        searchName = readlnOrNull()

        if (searchName == null || searchName.trim() == "") {
            throw Exception("Ошибка ввода имени!")
        }
    } catch (e: Exception) {
        println("Ошибка ввода: ${e.localizedMessage}")
        e.printStackTrace()
        return
    }

    println()

    // Вывод инфо о студенте

    try {
    } catch (e: Exception) {
        println("Ошибка: ${e.localizedMessage}")
        e.printStackTrace()
        return
    }

    println()

    //  Ввод новой оценки для студента

    try {
        println("Введи новую оценку: ")
        val newGrade = readln().toIntOrNull()

        if (newGrade != null) {
            studentsGrades[searchName] = newGrade
        } else {
            throw Exception("Ошибка ввода оценки!")
        }
    } catch (e: Exception) {
        println("Ошибка: ${e.localizedMessage}")
        e.printStackTrace()
        return
    }

    println()

    // Удаление студента

    studentsGrades.remove(searchName)
    enrolledStudents.remove(searchName)
    attendanceList.remove(searchName)
    studentsEmails.remove(searchName)

    println("Студент $searchName удален отовсюду")
    println("$searchName есть в  studentsGrades - ${studentsGrades.containsKey(searchName)}")
    println("$searchName есть в  enrolledStudents - ${enrolledStudents.contains(searchName)}")
    println("$searchName есть в  attendanceList - ${attendanceList.contains(searchName)}")
    println("$searchName есть в  studentsEmails - ${studentsEmails.containsKey(searchName)}")

    println()

    //  Состояние коллекций и их размеры

    println("$studentsGrades содержит ${studentsGrades.size} пары")
    println("$enrolledStudents содержит ${enrolledStudents.size} имени")
    println("$attendanceList содержит ${attendanceList.size} имени")
    println("$studentsEmails содержит ${studentsEmails.size} пары")
}
