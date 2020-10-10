package hackerrank

//https://www.hackerrank.com/challenges/plus-minus/problem

import java.util.*

fun plusMinus(arr: Array<Int>, n: Double) {
    var positiveNumbers = 0.0
    var negativeNumbers = 0.0
    var zeroNumbers = 0.0

    for (i in arr.indices) {
        when {
            arr[i] > 0 -> {
                positiveNumbers++
            }
            arr[i] < 0 -> {
                negativeNumbers++
            }
            arr[i] == 0 -> {
                zeroNumbers++
            }
        }
    }

    println(positiveNumbers / n)
    println(negativeNumbers / n)
    println(zeroNumbers / n)
}

fun main() {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toDouble()

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    plusMinus(arr, n)
}