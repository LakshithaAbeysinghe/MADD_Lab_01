fun whoAmI(input: Any): String {
    return input::class.simpleName ?: "Unknown"
}

fun main() {
    println(whoAmI(42))
    println(whoAmI("Hello"))
    println(whoAmI(true))
    println(whoAmI(3.14))
}