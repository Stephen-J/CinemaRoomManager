fun main() {
    val numElements = readLine()!!.toInt()
    val elements = IntArray(numElements)
    for (i in 0 until numElements) {
        elements[i] = readLine()!!.toInt()
    }
    val target = readLine()!!.split(" ").map{it.toInt()}.toIntArray()
    target.sort()
    var isNextTo = false
    for (i in 0 until elements.size - 1) {
        val e = intArrayOf(elements[i],elements[i + 1])
        e.sort()
        isNextTo = e.contentEquals(target)
        if (isNextTo) break
    }
    println(if (!isNextTo) "YES" else "NO")
}