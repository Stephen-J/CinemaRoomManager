package cinema

fun main() {
    val numRows = queryNumRows()
    val seatsPerRow = querySeatsPerRow()
    val roomProfit = calcRoomProfit(numRows,seatsPerRow)
    println("Total Income:")
    println("$$roomProfit")
}

fun queryNumRows(): Int {
    println("Enter the number of rows:")
    return readLine()!!.toInt()
}

fun querySeatsPerRow(): Int {
    println("Enter the number of seats in each row:")
    return readLine()!!.toInt()
}

fun calcRoomProfit(numRows: Int, seatsPerRow: Int): Int {
    val numSeats = numRows * seatsPerRow
    return if (numSeats <= 60) numSeats * 10 else {
        val front = numRows / 2
        val back = if (numRows % 2 == 0) front else front + 1
        front * seatsPerRow * 10 + back * seatsPerRow * 8
    }
}

fun printLayout(){
    println("Cinema:")
    println("  1 2 3 4 5 6 7 8 ")
    for (i in 1..7) {
        println("$i S S S S S S S S")
    }
}