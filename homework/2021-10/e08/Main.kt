fun sum (a : Int, b : Int, callback: (Int) -> Unit) {
    callback(a + b)
}


fun isPositive(a: Int, success: () -> Unit, error: () -> Unit) {
    if(a > 0) {
        success()
    } else {
        error()
    }
}

fun main() {

    // A)
    sum(4,5, {msg -> println("Result was $msg")})
    sum(4,5) {msg -> println("Result was $msg")}
    sum(4,5) { println("Result was $it") }

    // B)
    isPositive(5, {println("positive")}, {println("negative")})
    isPositive(-5, {println("positive")}, {println("negative")})
    isPositive(-5, {println("positive")}) {println("negative")}

}