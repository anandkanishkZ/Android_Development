fun main() {
    // Dictionary using mapOf() with words and their meanings
    val dictionary = mapOf(
        "happy" to "Feeling or showing pleasure or contentment.",
        "sad" to "Feeling or showing sorrow; unhappy.",
        "big" to "Of considerable size, extent, or intensity.",
        "small" to "Of a size that is less than normal or usual.",
        "fast" to "Moving or capable of moving at high speed."
    )

    // Prompt user for input
    println("Enter a word to find its meaning (or 'exit' to quit): ")

    while (true) {
        val input: String = readln().lowercase()

        // Check if user wants to exit
        if (input == "exit") {
            println("Goodbye!")
            break
        }

        // Look up the word in the dictionary
        val meaning = dictionary[input]
        if (meaning != null) {
            println("Meaning of '$input': $meaning")
        } else {
            println("Sorry, the word '$input' was not found in the dictionary.")
        }

        println("\nEnter another word (or 'exit' to quit): ")
    }
}