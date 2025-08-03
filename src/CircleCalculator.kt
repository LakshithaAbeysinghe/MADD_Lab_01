fun main() {
    print("Enter the radius of the circle: ")
    val input = readLine()

    if (input != null) {
        val radius = input.toDoubleOrNull()

        if (radius != null && radius > 0) {
            val pi = 3.14
            val circumference = 2 * pi * radius
            val area = pi * radius * radius

            println("Circumference: $circumference")
            println("Area: $area")
        } else {
            println("Invalid radius. Please enter a positive number.")
        }
    } else {
        println("No input provided.")
    }
}