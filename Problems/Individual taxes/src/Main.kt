fun main() {
    val numCompanies =  readLine()!!.toInt()
    val yearlyIncomes = readValues(numCompanies)
    val individualTaxes = readValues(numCompanies)
    var maxTaxes = 0
    var tmp = 0
    var maxIndex = 0
    for (i in 0 until numCompanies) {
        tmp = yearlyIncomes[i] * individualTaxes[i]
        if (tmp > maxTaxes) {
            maxIndex = i
            maxTaxes = tmp
        }
    }
    println(maxIndex + 1)
}

fun readValues(num : Int) : IntArray {
    val values = IntArray(num)
    for (i in 0 until num) {
        values[i] = readLine()!!.toInt()
    }
    return values
}