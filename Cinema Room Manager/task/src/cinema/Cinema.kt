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
            3 -> showStatistics(theatre)
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
    println("1. Show the seats\n2. Buy a ticket\n3. Statistics\n0. Exit")
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
    var seat : IntArray
    var success = false
    while (!success) {
        seat  = querySeatPurchase()
        if (seat[0] in 1..theatre.size && seat[1] in 1..theatre[0].size) {
            if (theatre[seat[0] - 1][seat[1] - 1] == 'S') {
                println("\nTicket Price: $${calcSeatPrice(seat[0],theatre)}")
                theatre[seat[0] - 1][seat[1] - 1] = 'B'
                success = true
            }else {
                println("\nThat ticket has already been purchased!\n")
            }

        }else {
            println("\nWrong input!\n")
        }
    }
}

fun querySeatPurchase() : IntArray {
    val seat = IntArray(2)
    println("Enter a row number:")
    seat[0] =  readLine()!!.toInt()
    println("Enter a seat number in that row:")
    seat[1] =  readLine()!!.toInt()
    return seat
}

fun showStatistics(theatre : Array<CharArray>) {
    val purchasedTickets = theatre.fold(0){seats,row -> seats + row.count{it == 'B'}}
    val percentage = (purchasedTickets / (theatre.size * theatre[0].size).toDouble()) * 100
    println("Number of purchased tickets: $purchasedTickets")
    println("Percentage: ${"%.2f".format(percentage)}%")
    println("Current income: $${calcCurrentIncome(theatre)}")
    println("Total income: $${calcTotalIncome(theatre)}")
}

fun calcCurrentIncome(theatre : Array<CharArray>) : Int {
    var income = 0
    for (i in theatre.indices) {
        income += theatre[i].fold(0){rowIncome,seat ->
            if (seat == 'B') rowIncome + calcSeatPrice(i + 1,theatre) else rowIncome
        }
    }
    return income
}

fun calcTotalIncome(theatre: Array<CharArray>) : Int {
    var totalIncome = 0
    for (i in theatre.indices) {
        totalIncome += calcSeatPrice(i + 1,theatre) * theatre[i].size
    }
    return totalIncome
}

fun calcSeatPrice(rowNum : Int,theatre: Array<CharArray>) : Int {
    val numRows = theatre.size
    val seatsPerRow = theatre[0].size
    val numSeats = numRows * seatsPerRow
    return if (numSeats <= 60) 10 else {
        val front = numRows / 2
        return if (rowNum <= front) 10 else 8
    }
}
