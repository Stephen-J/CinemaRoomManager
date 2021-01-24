fun main() {
    val armySize = readLine()!!.toInt()
    val category = when {
        armySize < 1 -> "no army"
        armySize in 1..4 -> "few"
        armySize in 5..9 -> "several"
        armySize in 10..19 -> "pack"
        armySize in 20..49 -> "lots"
        armySize in 50..99 -> "horde"
        armySize in 100..249 -> "throng"
        armySize in 250..499 -> "swarm"
        armySize in 500..999 -> "zounds"
        armySize >= 1000 -> "legion"
        else -> "Unknown"
    }
    println(category)

    var a = 10

    when (a) {
        11,12 -> print("")
        a + a -> print("")
        in 1..20 -> println("")
        in 1..22 -> println("")
    }
}