fun main() {
    val input = readLine()!!
    val result = when (input) {
        "1", "3", "4" -> "No!"
        "2" -> "Yes!"
        else -> "Unknown number"
    }
    println(result)
}