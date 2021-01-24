
fun main() {
    val input = readLine()!!.split(" ")
    val numA = input[0].toLong()
    val op = input[1]
    val numB = input[2].toLong()
    val result = when (op) {
        "+" -> (numA + numB).toString()
        "-" -> (numA - numB).toString()
        "/" -> if (numB == 0L) "Division by 0!" else (numA / numB).toString()
        "*" -> (numA * numB).toString()
        else -> "Unknown operator"
    }
    println(result)
}