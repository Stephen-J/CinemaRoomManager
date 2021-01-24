fun main() {
    val numElements = readLine()!!.toInt()
    val elements = IntArray(numElements)
    for (i in 0 until numElements) {
        elements[i] = readLine()!!.toInt()
    }
    val target = readLine()!!.toInt()
    var found = false
    for (n in elements) {
        found = n == target
        if (found) break
    }
    println(if (found) "YES" else "NO")
}