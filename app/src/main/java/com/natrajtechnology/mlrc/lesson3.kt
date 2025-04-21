package com.natrajtechnology.mlrc

//1. List
//
//List  stores elements in a specified order and provides indexed access them. Indices start from 0, the first element-
//go to the lastindex which is the (list.size-1).
//
//Example

fun main() {
    println("=== List Example ===")
    displayList()

    println("\n=== List Types (Mutable/Immutable) ===")
    listType()

    println("\n=== Set Example ===")
    set()

    println("\n=== Map Example ===")
    map()

    println("\n=== Immutable Map Example (Student) ===")
    student()

    println("\n=== Mutable Map Example (Student) ===")
    mutableStudent()
}

fun displayList() {
    val numbers: List<String> = listOf("one", "two", "three", "four")
    println("Number of elements: ${numbers.size}")
    println("Third element: ${numbers.get(2)}")
    println("Fourth element: ${numbers[3]}")
    println("Index of element \"two\": ${numbers.indexOf("two")}")
}

//1.1 Mutable and Immutable List
//
//Kotlin has two types of lists
//
//1. immutable lists (cannot be modified) and
//
//2. mutable lists (can be modified).

fun listType() {
    // Immutable List
    val lst = listOf("one", "two", "three")
    println("Immutable List:")
    for (i in lst.indices) {
        println(lst[i])
    }
    println()

    // Mutable List
    val mutableLst = mutableListOf("one", "two", "three")
    mutableLst.add("Four")
    println("Mutable List:")
    for (i in mutableLst.indices) {
        println(mutableLst[i])
    }
}

//    2. Set
//
//    •Set stores unique elements.
//
//    •Two sets are equal if they have the same size, and for each element of a set there is an equal element in the other set.
//
//    •Similarly, set can also be mutable and immutable

fun set() {
    val numbersSet = setOf(1, 2, 3, 4)
    for (elements in numbersSet) {
        println(elements)
    }
    val numbersBackwards = setOf(4, 3, 2, 1)
    println("The sets are equal: ${numbersSet == numbersBackwards}")
}

//    3. Map
//    A Map<k,v> stores key-value pairs (or entries); keys are unique, but different keys can be paired with equal values.
//    The Map interface provides specific functions, such as access to value by key, searching keys and values, and so on.

fun map() {
    val countriesCapitals = mapOf(
        "Nepal" to "Kathmandu",
        "China" to "Beijing",
        "India" to "New Delhi"
    )
    println("All keys: ${countriesCapitals.keys}")
    println("All values: ${countriesCapitals.values}")
    println("Capital of Nepal is: ${countriesCapitals["Nepal"]}")
}

//Example : (Immutable Map)
fun student() {
    val studentMarks = mapOf(
        "ram" to 45,
        "shyam" to 45,
        "hari" to 45,
        "gita" to 45
    )
    println("Enter student name: ")
    val input: String = readln().lowercase()
    println("Marks: ${studentMarks[input] ?: "Student not found"}")
}

fun mutableStudent() {
    val studentMarks = mutableMapOf(
        "ram" to 45,
        "shyam" to 45,
        "hari" to 45,
        "gita" to 45
    )
    studentMarks["ram"] = 60
    studentMarks.put("sabin", 80)
    println("Enter student name: ")
    val input: String = readln().lowercase()
    println("Marks: ${studentMarks[input] ?: "Student not found"}")
}
