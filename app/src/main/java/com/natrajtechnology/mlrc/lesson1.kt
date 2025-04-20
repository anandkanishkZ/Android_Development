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
}