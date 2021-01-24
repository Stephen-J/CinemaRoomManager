package cinema

fun main() {
    val theatre = queryTheatreSize()
    do {
        println()
        val choice = queryMenuChoice()
        println()
        when (choice) {
            1 -> showTheatre(theatre)
            2 -> purchaseSeat(theatre)
        }
    } while (choice != 0)
}

fun queryTheatreSize(): Array<CharArray> {
    println("Enter the number of rows:")
    val numRows = readLine()!!.toInt()
    println("Enter the number of seats in each row:")
    val seatsPerRow = readLine()!!.toInt()
    return Array(numRows) {
        CharArray(seatsPerRow) { 'S' }
    }
}

fun queryMenuChoice(): Int {
    println("1. Show the seats\n2. Buy a ticket\n0. Exit")
    return readLine()!!.toInt()
}

fun showTheatre(theatre : Array<CharArray>) {
    println("Cinema:")
    val header = IntArray(theatre[0].size){it + 1}
    println("  ${header.joinToString(" ")}")
    for (i in theatre.indices) {
        println("${i + 1} ${theatre[i].joinToString(" ")}")
    }
}

fun purchaseSeat(theatre : Array<CharArray>) {
    println("Enter a row number:")
    val rowNum =  readLine()!!.toInt()
    println("Enter a seat number in that row:")
    val seatNum =  readLine()!!.toInt()
    println("Ticket Price: $${calcSeatPrice(rowNum,theatre.size,theatre[0].size)}")
    theatre[rowNum - 1][seatNum - 1] = 'B'
}

fun calcSeatPrice(rowNum : Int,numRows : Int,seatsPerRow : Int) : Int {
    val numSeats = numRows * seatsPerRow
    return if (numSeats <= 60) 10 else {
        val front = numRows / 2
        return if (rowNum <= front) 10 else 8
    }
}
