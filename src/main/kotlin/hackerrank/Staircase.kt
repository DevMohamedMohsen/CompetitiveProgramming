package hackerrank

//https://www.hackerrank.com/challenges/staircase/problem

import java.util.*

fun staircase(n: Int) {
    var newRow = true

    for (i in 1..n) {
        for (j in 1..i) {
            if (newRow) {
                newRow = false
                for (k in 1..n - i) {
                    print(" ")
                }
            }
            print("#")
        }
        println()
        newRow = true
    }
}

fun main() {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    staircase(n)
}