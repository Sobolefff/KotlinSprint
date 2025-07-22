package org.example.lesson_2

const val NUMBER_OF_WORKERS = 50
const val SALARY_OF_WORKER = 30000

fun main() {

    val numberOfInterns = 30
    val salaryOfIntern = 20000

    val totalSalaryOfWorkers: Int = NUMBER_OF_WORKERS * SALARY_OF_WORKER
    val totalSalaryOfAll: Int = totalSalaryOfWorkers + numberOfInterns * salaryOfIntern
    val averageSalary: Int = totalSalaryOfAll / (NUMBER_OF_WORKERS + numberOfInterns)

    println("""
            Total salary of workers: $totalSalaryOfWorkers
            Total salary of all: $totalSalaryOfAll
            Average salary: $averageSalary
    """.trimIndent())

}