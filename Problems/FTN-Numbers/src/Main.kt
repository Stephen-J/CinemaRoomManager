fun main() {
    val input = readLine()!!.toInt()
    val result = when (input) {
        0,1,2,3,5,8,13,21,34,55 -> "F"
        6,10,15,28,36,45 -> "T"
        100,1000,10000,100000 -> "P"
        else -> "N"
    }
    println(result)
}