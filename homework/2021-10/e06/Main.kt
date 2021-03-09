import java.time.LocalDate

fun getDaysOfCurrentMonth(): Int {
    var date = LocalDate.now()
    var month = date.getMonthValue()
    var totalDays = when (month) {
        2                       -> if (date.isLeapYear()) 29 else 28
        1, 3, 5, 7, 8, 10, 12   -> 31
        4, 6, 9, 11             -> 30
        else                    -> -1
    }
    return totalDays
}

fun main() {
    var days = getDaysOfCurrentMonth()
    println(days)
}