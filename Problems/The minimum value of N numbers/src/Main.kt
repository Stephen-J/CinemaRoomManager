fun main() {
    val numInput = readLine()!!.toInt()
    var min = Integer.MAX_VALUE
    var tmp : Int
    repeat(numInput){
        tmp = readLine()!!.toInt()
        if (tmp < min) min = tmp
    }
    println(min)
}