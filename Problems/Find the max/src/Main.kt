fun main() {
    val numElements = readLine()!!.toInt()
    var max = Integer.MIN_VALUE
    var maxIndex = 0
    var tmp = 0
    for (i in 0 until numElements) {
        tmp = readLine()!!.toInt()
        if (tmp > max) {
            max = tmp
            maxIndex = i
        }
    }
    println(maxIndex)
}