abstract class Employee(val name: String, val id: Int) {
    abstract fun getDetails()
}

class TemporaryStaff(name: String, id: Int, val hourlyRate: Double) : Employee(name, id) {
    override fun getDetails() {
        println("Temporary Staff: $name, ID: $id, Hourly Rate: $hourlyRate")
    }
}

class PermanentStaff(name: String, id: Int, val salary: Double) : Employee(name, id) {
    override fun getDetails() {
        println("Permanent Staff: $name, ID: $id, Salary: $salary")
    }
}

fun main() {
    println("Enter Temporary Staff Details:")
    print("Name: ")
    val tempName = readLine() ?: ""
    print("ID: ")
    val tempId = readLine()?.toIntOrNull() ?: 0
    print("Hourly Rate: ")
    val tempRate = readLine()?.toDoubleOrNull() ?: 0.0

    println("\nEnter Permanent Staff Details:")
    print("Name: ")
    val permName = readLine() ?: ""
    print("ID: ")
    val permId = readLine()?.toIntOrNull() ?: 0
    print("Salary: ")
    val permSalary = readLine()?.toDoubleOrNull() ?: 0.0

    println("\n--- Employee Details ---")
    val temp = TemporaryStaff(tempName, tempId, tempRate)
    val perm = PermanentStaff(permName, permId, permSalary)

    temp.getDetails()
    perm.getDetails()
}