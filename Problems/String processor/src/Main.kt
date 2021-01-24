fun main() {
    val strA = readLine()!!
    val op = readLine()!!
    val strB = readLine()!!
    val result = when (op) {
        "equals" -> (strA == strB).toString()
        "plus" -> "$strA$strB"
        "endsWith" -> strA.endsWith(strB).toString()
        else -> "Unknown operation"
    }
    println(result)
}