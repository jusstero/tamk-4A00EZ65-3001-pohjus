fun giveStock(company : String?): String? {
    var stockName = when (company) {
        "Microsoft"     -> "MSFT"
        "Apple"         -> "APPL"
        "Nokia"         -> "NOK"
        else            -> null
    }
    return stockName
}

fun main() {
    println("Give company name")
    var userStr : String? = readLine()
    var companyStockName = giveStock(userStr)

    if(companyStockName != null) println(companyStockName.toLowerCase()) else println("Stock not found")
}