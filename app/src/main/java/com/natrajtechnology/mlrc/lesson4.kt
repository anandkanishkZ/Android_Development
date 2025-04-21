package com.natrajtechnology.mlrc

// Arithmetic Operator Example: +, -, *, /, %
fun main() {
    var num1: Double = 10.6
    var num2: Double = 5.0
    var result: Double = 0.0

    // Performing arithmetic operations and displaying the results
    result = num1 + num2
    println("num1 + num2 is $result")
    result = num1 - num2
    println("num1 - num2 is $result")
    result = num1 * num2
    println("num1 * num2 is $result")
    result = num1 / num2
    println("num1 / num2 is $result")
    result = num1 % num2
    println("num1 % num2 is $result")

    assignmentOperator()
    unaryOperator()
    relationalOperator()
    logicalOperator()
    bodmasExample()
    charRangeExample()
    inputExample()
}

// Demonstrates Assignment Operators like =, +=, -=, *=, /=, %=
fun assignmentOperator() {
    var x: Int = 20
    var y: Int = 10
    var z: Int = 0

    z = x + y
    println("z = x + y = $z")
    z += x
    println("z += x = $z")
    z -= x
    println("z -= x = $z")
    z *= x
    println("z *= x = $z")
    z /= x
    println("z /= x = $z")
    z %= x
    println("z %= x = $z")
}

// Demonstrates Unary Operators like ++, --, !
fun unaryOperator() {
    var number: Double = 7.6
    var isCheck: Boolean = true

    println("++number = ${++number}") // Pre-increment
    println("--number = ${--number}") // Pre-decrement
    println("number++ = ${number++}") // Post-increment
    println("number after number++ = $number") // Value after post-increment
    println("!isCheck = ${!isCheck}") // Boolean NOT operator
}

// Demonstrates Relational Operators like ==, !=, <, >, <=, >=
fun relationalOperator() {
    var a: Int = 5
    var b: Int = 5

    println("a == b : " + (a == b))
    println("a != b : " + (a != b))
    println("a < b : " + (a < b))
    println("a > b : " + (a > b))
    println("a >= b : " + (a >= b))
    println("a <= b : " + (a <= b))
}

// Demonstrates Logical Operators: &&, ||
fun logicalOperator() {
    var number1: Int = 5
    var number2: Int = 8
    var number3: Int = 12
    var result: Boolean

    result = (number1 > number2) && (number3 > number2)
    println("Result of &&: $result")

    result = (number1 > number2) || (number3 > number2)
    println("Result of ||: $result")
}

// Demonstrates BODMAS rule in expressions
fun bodmasExample() {
    var result: Int = 5 + 2 * 4
    println("Result of 5 + 2 * 4 = $result")

    result = (5 + 2) * 4
    println("Result of (5 + 2) * 4 = $result")

    var x: Int = 8
    var y: Int = 4
    var z: Int = 2
    var sum: Int = x + -y + -z
    println("x + -y + -z : $sum")
}

// Demonstrates character range and membership test
fun charRangeExample() {
    var myCharRange = 'a'..'j' // defines a character range from a to j
    var check = 'Z' in myCharRange // checks if 'Z' is within the range
    println("myCharRange has Z: $check")
    println("myCharRange: $myCharRange")
}

// Demonstrates input with type conversion
fun inputExample() {
    print("Enter name: ")
    val name: String? = readln() // reading user input as string

    print("Enter age: ")
    val age: Int = readln().toInt() // converting string input to integer

    println("Your name is $name and you are $age years old.")
}
