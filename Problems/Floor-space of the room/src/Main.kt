import kotlin.math.sqrt

fun main() {
    val area : Double = when (readLine()!!) {
        "triangle" -> {
            val a = readLine()!!.toDouble()
            val b = readLine()!!.toDouble()
            val c = readLine()!!.toDouble()
            val p = (a + b + c) / 2
            sqrt(p * (p - a) * (p - b) * (p - c)) // Heron's formula
        }
        "rectangle" -> {
            val a = readLine()!!.toDouble()
            val b = readLine()!!.toDouble()
            a * b
        }
        "circle" -> {
            val r = readLine()!!.toDouble()
            3.14 * r * r
        }
        else -> 0.0
    }
    println(area)
}