package org.example.lesson_1

fun main() {
    val totalOrderCount: Int = 75
    val thankMessage: String = "Спасибо за покупку!"

    println("Текущее количество заказов: $totalOrderCount")
    println("Сообщение для клиента: $thankMessage")

    var currentEmployeeCount: Int = 2000

    println("Количество сотрудников: $currentEmployeeCount")

    currentEmployeeCount -= 1

    println("Количество сотрудников после увольнения: $currentEmployeeCount")
}
