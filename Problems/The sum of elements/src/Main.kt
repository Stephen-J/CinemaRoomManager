fun main(args: Array<String>) {
    var input = readLine()!!.toInt()
    var sum = 0
    while (input != 0) {
        sum += input
        input = readLine()!!.toInt()
    }
    println(sum)
}