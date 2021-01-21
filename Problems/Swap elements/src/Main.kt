// The array numbers already exists. Write only exchange actions here.

//fun swap(numbers:IntArray){
//    val tmpLast = numbers.last()
//    numbers[numbers.lastIndex]
//}

val tmpLast = numbers.last()
numbers[numbers.lastIndex] = numbers[0]
        numbers[0] = tmpLast