open class EmployeeDetails(name: String, age: Int, salary: Float) {
    init {
        println("Name is $name.")
        println("Age is $age")
        println("Salary is $salary")
    }
}
class Programmer(name: String, age: Int, salary: Float):EmployeeDetails(name,age,salary){
    fun doProgram() {
        println("programming is my passion.")
    }
}
class Salesman(name: String, age: Int, salary: Float):EmployeeDetails(name,age,salary){
    fun fieldWork() {
        println("travelling is my hobby.")
    }
}
fun main(args: Array<String>){
    val obj1 = Programmer("Swetha", 78, 900000f)
    obj1.doProgram()
    val obj2 = Salesman("Harika", 24, 30000f)
    obj2.fieldWork()
}