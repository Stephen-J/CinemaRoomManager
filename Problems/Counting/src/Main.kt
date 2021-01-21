fun main() {
    val numElements = readLine()!!.toInt()
    val elements = IntArray(numElements)
    for (i in 0 until numElements) {
        elements[i] = readLine()!!.toInt()
    }
    val target = readLine()!!.toInt()
    var count = 0
    for (i in 0 until numElements) {
        if (elements[i] == target) count++
    }
    println(count)
}