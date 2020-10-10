package hackerrank

//https://www.hackerrank.com/challenges/simple-array-sum/problem

import java.util.*

fun simpleArraySum(ar: Array<Int>): Int {
    var sum = 0
    for (value: Int in ar) {
        sum += value
    }
    return sum
}

fun main() {
    val scan = Scanner(System.`in`)

    scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = simpleArraySum(ar)

    println(result)
}