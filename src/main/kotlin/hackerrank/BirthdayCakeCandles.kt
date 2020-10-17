package hackerrank

//https://www.hackerrank.com/challenges/birthday-cake-candles/problem

fun birthdayCakeCandles(candles: Array<Int>): Int {
    candles.sortDescending()

    val tallestCandle = candles[0]
    var tallestCandleCount = 0

    for (i in candles.indices) {
        if (candles[i] == tallestCandle) {
            tallestCandleCount++
        }
    }

    return tallestCandleCount
}

fun main() {
    readLine()!!.trim().toInt()

    val candles = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}