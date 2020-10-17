package hackerrank

//https://www.hackerrank.com/challenges/grading/problem

fun gradingStudents(grades: Array<Int>): Array<Int> {
    for (i in grades.indices) {
        val roundedGrade = roundUp(grades[i])
        if (roundedGrade >= 40) {
            if ((roundedGrade - grades[i]) < 3) {
                grades[i] = roundedGrade
            }
        }
    }
    return grades
}

fun roundUp(n: Int): Int {
    return (n + 4) / 5 * 5
}

fun main() {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array(gradesCount) { 0 }
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}