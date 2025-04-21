package com.natrajtechnology.mlrc

fun show(a: Int, b: Int): Unit {
    println("You entered $a and $b")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun findMinimumNumber(a: Int, b: Int): Int {
    return if (a > b) b else a
}

fun main() {
    print("Enter first number: ")
    val a: Int = readLine()!!.toInt()

    print("Enter second number: ")
    val b: Int = readLine()!!.toInt()

    show(a, b)

    val sum = add(a, b)
    println("Sum of the two entered numbers is $sum")

    val minimum = findMinimumNumber(a, b)
    println("And the smallest between $a and $b is $minimum")
}
