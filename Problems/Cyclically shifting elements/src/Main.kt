fun main() {
    val numElements = readLine()!!.toInt()
    val elements = IntArray(numElements)
    for (i in 0 until numElements) {
        elements[i] = readLine()!!.toInt()
    }
    val result = IntArray(numElements)
    result[0] = elements.last()
    for (i in 1 until numElements) {
        result[i] = elements[i - 1]
    }
    println(result.joinToString(" "))
}