fun main() {
    val names = Array(5) { "" }

    for (i in names.indices) {
        print("Enter name ${i + 1}: ")
        names[i] = readLine() ?: ""
    }

    println("\nEntered Names:")
    for ((index, name) in names.withIndex()) {
        println("[$index] $name")
    }
}