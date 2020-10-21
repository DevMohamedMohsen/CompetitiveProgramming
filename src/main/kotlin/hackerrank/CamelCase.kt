package hackerrank

//https://www.hackerrank.com/challenges/camelcase/problem

import java.util.*

fun camelcase(s: String): Int {
    var wordsCount = 1

    for (i in s.indices) {
        if (s[i].isUpperCase()) wordsCount++
    }

    return wordsCount
}

fun main() {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = camelcase(s)

    println(result)
}