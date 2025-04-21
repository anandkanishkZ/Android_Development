package com.natrajtechnology.mlrc

fun main(args: Array<String>) {
    val age = arrayOf(1, 2, 3)
    println(age.contentToString())  // To print full array content
    println("The first element of age is ${age[0]}")
    println("The second element of age is ${age[1]}")
    println("The third element of age is ${age[2]}")

    println("************************************")

    val name = arrayOf("ram", "shyam", "Hari")
    name[1] = "sandis"
    println("The first element of name is ${name[0]}")
    println("The second element of name is ${name[1]}")
    println("The third element of name is ${name[2]}")
    println("Size of name array: ${name.size}")

    println("************************************")

    arrayValue()
    modifyNames()
    mixArray()
}

fun arrayValue() {
    val age1 = ArrayList<Int>()
    age1.add(1)
    age1.add(1, 20)
    age1.add(5)
    println("ArrayList age1: $age1")
}

fun modifyNames() {
    val age2 = arrayListOf(1, 20, 5)
    val name = arrayListOf("sandis", "ram", "shyam")
    name.add("hari")
    name.add("sita")  // Append instead of inserting at index 4

    name.remove("shyam")
    name.removeAt(0)

    println("Modified name list: $name")
}

fun mixArray() {
    val mixArrayList = arrayListOf<Any>("hello", 5, 2.0)
    println("Mixed ArrayList:")
    println(mixArrayList[0])
    println(mixArrayList[1])
    println(mixArrayList[2])
}
