fun main() {
    val numString = readLine()!!
    println(numString.map{Integer.parseInt(it.toString())}.reduce{a,b ->
        a + b
    })
}