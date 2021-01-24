fun main() {
    val numElements = readLine()!!.toInt()
    val elements = IntArray(numElements)
    for (i in 0 until numElements) {
        elements[i] = readLine()!!.toInt()
    }
    var numTriples = 0
    val tmp = IntArray(3)
    for (i in 0 until elements.size - 2) {
        tmp[0] = elements[i]
        tmp[1] = elements[i + 1]
        tmp[2] = elements[i + 2]
        if ((tmp[1] - tmp[0]) + (tmp[2] - tmp[1]) == 2) numTriples++
    }
    println(numTriples)
}