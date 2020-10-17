package hackerrank

//https://www.hackerrank.com/challenges/time-conversion/problem

import java.text.SimpleDateFormat
import java.util.*

fun timeConversion(s: String): String {
    val originalFormat = SimpleDateFormat("hh:mm:ssa", Locale.US)
    val targetFormat = SimpleDateFormat("HH:mm:ss", Locale.US)
    return targetFormat.format(originalFormat.parse(s))
}

fun main() {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}