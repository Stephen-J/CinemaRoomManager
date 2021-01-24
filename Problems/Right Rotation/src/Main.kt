fun main() {
    val numElements = readLine()!!.toInt()
    val elements = IntArray(numElements)
    for (i in elements.indices) {
        elements[i] = readLine()!!.toInt()
    }
    val rightShifts = readLine()!!.toInt()
    val actualShifts = rightShifts % elements.size
    var tmp = 0
    var result = elements
    if (actualShifts != 0) {
        result = IntArray(numElements)
        for (i in result.indices) {
            val newIndex = (i + (numElements - actualShifts)) % numElements
            result[i] = elements[newIndex]
        }
    }
    println(result.joinToString(" "))
}