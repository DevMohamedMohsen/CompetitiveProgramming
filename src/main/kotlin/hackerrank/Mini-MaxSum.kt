package hackerrank

//https://www.hackerrank.com/challenges/mini-max-sum/problem

import java.util.*

fun miniMaxSum(arr: Array<Long>) {
    arr.sort()

    var miniSum: Long = 0
    var maxSum: Long = 0

    for (i in arr.indices) {
        if (i in 0 until arr.size - 1) {
            miniSum += arr[i]
        }

        if (i in 1 until arr.size) {
            maxSum += arr[i]
        }
    }

    print("$miniSum $maxSum")
}

fun main() {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map { it.trim().toLong() }.toTypedArray()

    miniMaxSum(arr)
}