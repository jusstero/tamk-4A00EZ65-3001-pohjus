fun validateUserLotto(args: Array<String>) : List<Int?>? {
    if (args.size != 7) return null

    var userLotto = mutableListOf<Int?>()
    var lottoSizeRange = 0..6

    for (i in lottoSizeRange) {
        val value : Int? = args[i].toIntOrNull()
        userLotto.add(value)
    }

    for (i in lottoSizeRange) if (userLotto[i] == null || userLotto[i] !in 1..40) return null
    if (hasDuplicates(userLotto)) return null

    return userLotto
}

fun hasDuplicates(array: MutableList<Int?>): Boolean {
    return array.size != array.distinct().count();
}

fun calculateLotto() : Set<Int> {
    val lottoNumbers = mutableSetOf<Int>()
    while(lottoNumbers.size < 7) lottoNumbers.add((1..40).random())
    return lottoNumbers
}

fun runLotto(userNumbers: List<Int?>) {
    println("calculating lotto...")
    var victory: Boolean = false
    var weekCounter = 0
    var highScoreArray = mutableListOf<Double>(-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0)

    while(!victory) {
        var lottoNumbers = calculateLotto()
        var correctNumbers = 0

        for(i in 0..6) {
            if(lottoNumbers.contains(userNumbers[i])) correctNumbers = correctNumbers +1
        }

        if(correctNumbers.equals(7)) victory = true

        checkHighScore(correctNumbers, weekCounter, highScoreArray)
        weekCounter ++
    }
}

fun checkHighScore(correctNumbers: Int, weekCounter: Int, highScoreArray: MutableList<Double>) {
    var years: Double = weekCounter.toDouble() / 52

    for(i in 0..correctNumbers -1) {
        if(highScoreArray[i] < 0 || highScoreArray[i] > years) highScoreArray[i] = years
    }

    if(correctNumbers == 7) {
        for(i in 1..correctNumbers) {
        var x = "%.2f".format(highScoreArray[i-1])
        println("You got $i correct, it took $x years")
        }
    }
}

fun main(args: Array<String>) {
    val userNumbers = validateUserLotto(args)
    if (userNumbers != null) runLotto(userNumbers) else println("give lotto row of 7 unique numbers between 1-40")
}