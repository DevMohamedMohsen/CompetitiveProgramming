package hackerrank

//https://www.hackerrank.com/challenges/a-very-big-sum/problem

import java.util.*

fun aVeryBigSum(ar: Array<Long>): Long {
    var result: Long = 0

    for (value in ar) {
        result += value
    }

    return result
}

fun main() {
    val scan = Scanner(System.`in`)

    scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toLong() }.toTypedArray()

    val result = aVeryBigSum(ar)

    println(result)
}