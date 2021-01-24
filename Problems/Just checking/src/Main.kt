import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val numElements = scanner.nextInt()
    val elements = IntArray(numElements)
    for (i in 0 until numElements) {
        elements[i] = scanner.nextInt()
    }
    val target = intArrayOf(scanner.nextInt(),scanner.nextInt())
    target.sort()
    var nextTo = false
    for (i in 0 until elements.size - 1) {
        val tmp = intArrayOf(elements[i],elements[i + 1])
        tmp.sort()
        if (tmp.contentEquals(target)) {
            nextTo = true
            break
        }
    }
    println(if (nextTo) "YES" else "NO")
}
