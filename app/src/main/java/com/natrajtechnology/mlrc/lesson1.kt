package com.natrajtechnology.mlrc

fun main(args: Array<String>) {
    print("Hello World")

    // mutable
    // we can reassign values to mutable variables
    var age = 20
    age = 25

    // immutable
    // we can't reassign values to immutable variables
    val roll = 15
    // roll = 10 // This line causes an error because 'roll' is a 'val' (immutable)

    var a: Boolean = true
    var b: Char = 'R'
    var c: Byte = 12
    var d: Short = -356
    var e: Int = 43543
    var f: Long = -51321354L
    var floatValue: Float = 5.6451344F // Renamed from 'i' to 'floatValue'
    var h: Double = 7.32644564

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(floatValue)
    println(h)

    // Type conversion in Kotlin
    var x: Double = 132.32
    var y: Int = x.toInt()
    var z: Byte = y.toByte()

    println(x)
    println(y)
    println(z)

    // String Data types in Kotlin
    var str: String = "Hello world" // Renamed from 'a' to 'str' for clarity
    var stringLength: Int = str.length // Renamed from 'i' to 'stringLength'
    var x2: Boolean = str.equals("Hello world") // Renamed from 'x' to 'x2' to avoid shadowing
    var username: String = "   softwarica   "

    println(username.trim())
    println(str)
    println(stringLength)
    println(str.isEmpty())
    println(str.lowercase())
    println(str.uppercase())
    println(x2)
    print(str.plus(", How are you?"))
}