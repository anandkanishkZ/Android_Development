package com.natrajtechnology.mlrc

import kotlin.random.Random

fun main() {
    // Helper function to safely read integers
    fun readInt(prompt: String): Int {
        print(prompt)
        return readLine()?.toIntOrNull() ?: 0
    }

    // Section 1: Even or Odd
    val number = readInt("Please enter a number: ")
    println(if (number % 2 == 0) "$number is even" else "$number is odd")

    // Section 2: Age classification
    val yourAge = readInt("\nPlease enter your age: ")
    println(
        when {
            yourAge < 13 -> "You are a child"
            yourAge < 19 -> "You are a teenager"
            yourAge < 50 -> "You are an adult"
            else -> "You are a senior"
        }
    )

    // Section 3: Largest of three numbers
    println("\nPlease enter 3 numbers: ")
    val number1 = readInt("Number 1: ")
    val number2 = readInt("Number 2: ")
    val number3 = readInt("Number 3: ")
    val largest = maxOf(number1, number2, number3)
    println("The largest number is $largest")

    // Section 4: Day of the week
    val dayNumber = readInt("\nPlease enter a day number of week (1-7): ")
    val day = when (dayNumber) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Invalid day choice"
    }
    println(day)

    // Section 5: Print 1 to 9
    println("\nPrinting numbers from 1 to 9:")
    for (i in 1..9) println(i)

    // Section 6: Sum 0 to 5
    println("\nSumming numbers from 0 to 5:")
    var sum = 0
    for (x in 0..5) {
        println(x)
        sum += x
    }
    println("The sum is $sum")

    // Section 7: Sum of even numbers
    println("\nSumming even numbers from 0 to 10:")
    sum = 0
    for (x in 0..10 step 2) {
        println(x)
        sum += x
    }
    println("The sum of even numbers is $sum")

    // Section 8 & 9: ArrayList iterations
    val vehicle = arrayListOf("Tata", "Kia", "Hyundai", "MG")
    println("\nIterating over vehicle list using indices:")
    for (i in vehicle.indices) println("The value at index $i is: ${vehicle[i]}")
    println("\nIterating over vehicle list using forEach:")
    vehicle.forEach { println(it) }

    // Section 10: While loop
    println("\nPrinting numbers 0 to 4 using while loop:")
    var i = 0
    while (i < 5) {
        println(i)
        i++
    }

    // Section 11: Factorials
    println("\nCalculating factorials from 1 to 5:")
    var k = 1
    var fact = 1
    while (k <= 5) {
        fact *= k
        println("$k! = $fact")
        k++
    }

    // Section 12: Number guessing game
    println("\nNumber guessing game (0 to 10000):")
    val numberToGuess = Random.nextInt(0, 10001)
    var guessedCorrectly = false
    while (!guessedCorrectly) {
        val userGuess = readInt("Please enter any number from 0 to 10000: ")
        when {
            userGuess == numberToGuess -> {
                println("Congratulations!!!!, you won")
                guessedCorrectly = true
            }
            userGuess < numberToGuess -> println("Increase your guess")
            else -> println("Decrease your guess")
        }
    }

    // Section 13: Do-while loop
    println("\nPrinting numbers 1 to 15 using do-while loop:")
    var number_ = 1
    do {
        println(number_)
        number_++
    } while (number_ <= 15)
}
