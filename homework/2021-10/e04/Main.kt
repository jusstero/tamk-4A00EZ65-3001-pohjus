fun main() {
    println("Give string")
    val userString : String? = readLine()

    println("Give numeric value")
    val value : String? = readLine()
    val userInt : Int? = value?.toIntOrNull()

    if(userInt != null) {
        val amount : Int = userInt
        for (i in 1..amount) {
            println(userString)
        }   
    }
}
