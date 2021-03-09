fun isPalindrome(string: String) :Boolean {
    var str = string.toLowerCase()
    var temp = ""

    var length = str.length -1
    for (i in length downTo 0) {
        temp += str[i]
    }

    if (temp == str) return true else return false
}

fun main() {
    println(isPalindrome("PIRJO"))
    println(isPalindrome("saippuakauppias"))
}