package hackerrank

//https://www.hackerrank.com/challenges/diagonal-difference/problem

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var primaryDiagonal = 0
    var secondaryDiagonal = 0
    var secondaryIndex: Int = arr.size - 1

    for ((primaryIndex, i) in arr.indices.withIndex()) {

        for (j in arr[i].indices) {

            if (j == primaryIndex) {
                primaryDiagonal += arr[i][j]
            }

            if (j == secondaryIndex) {
                secondaryDiagonal += arr[i][j]
            }
        }

        secondaryIndex--
    }

    return when (primaryDiagonal > secondaryDiagonal) {

        true -> {
            primaryDiagonal - secondaryDiagonal
        }

        false -> {
            secondaryDiagonal - primaryDiagonal
        }
    }
}

fun main() {
    val n = readLine()!!.trim().toInt()

    val arr = Array(n) { Array(n) { 0 } }

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}