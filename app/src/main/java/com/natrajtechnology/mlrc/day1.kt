package com.natrajtechnology.mlrc

fun main() {
//    // Immutable variable (val)
//    val fixedAge = 10
//    // fixedAge = 20 // ❌ This will cause an error because val cannot be reassigned
//
//    // Mutable variable (var)
//    var name = "Anand Kanishk"
//    name = "Ram"
//
//    // Specifying types explicitly
//    var fullName: String = "Anand Sharma"
//    var age: Int = 21
//
//    // String concatenation
//    println("Hello I am " + fullName + " and I am " + age + " years old")
//
//    // String interpolation (preferred way)
//    println("Hello I am ${fullName.lowercase()} and I am $age years old")
//
//    println("Hey Android User's")


//    var age = arrayOf((10,20,30)
//    age[3] = 50
//    println(age[3])
//
//    var male = arrayListOf<String>("ram", "shyam")
//    var female = ArrayList<Any>()
//
//    female.add("sita")
//    female.add(1)
//    female.add("gita")
//    male.add("hari")
//    male.removeAt(0)



//    var meaning = mapOf(
//        "apple" to "This is fruits",
//        "samsung" to "This is mobile phone"
//
//    )
//
//    println(meaning["apple"])

//    fun main() {
//        print("Enter a day number of the week (1-7): ")
//
//        val dayNumber: Int = readln().toInt() // reading input and converting to Int
//        val day: String = when (dayNumber) {
//            1 -> "Sunday"
//            2 -> "Monday"
//            3 -> "Tuesday"
//            4 -> "Wednesday"
//            5 -> "Thursday"
//            6 -> "Friday"
//            7 -> "Saturday"
//            else -> "Invalid day choice"
//        }
//
//        println("Day: $day")
//    }


//    //for loop
//
//    for(i in 0 .. 5) {
//        println(i)
//    }

    fun calculate(a: Int, b: Int): Int {
        val c: Int = a + b
        return c
    }

    // Cleaner without specifying `: Unit`
    fun calculate2(a: Int, b: Int) {
        val c: Int = a + b
        println(c)
    }





}
