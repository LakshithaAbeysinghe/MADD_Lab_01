fun greetings(name: String, age: Int) {
    println("Hello $name, you are $age years old.")

    if (age >= 18) {
        println("You are eligible for a driving license.")
    } else {
        println("You are not eligible for a driving license.")
    }
}

fun main() {
    print("Enter your name: ")
    val name = readLine() ?: ""

    print("Enter your age: ")
    val ageInput = readLine()
    val age = ageInput?.toIntOrNull()

    if (age != null) {
        greetings(name, age)
    } else {
        println("Invalid age input.")
    }
}