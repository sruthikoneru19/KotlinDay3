package Collections

class Employee(id:Int,name:String,dept:String,salary:Int,age:Int)
{
    var id:Int=id
    var name:String=name
    var dept:String=dept
    var salary:Int=salary
    var age:Int=age
}

fun main()
{
    var emp= mutableListOf<Employee>()
    emp.add (Employee(1,"Sruthi","CSE",30000,20))
    emp.add(Employee(2,"Swetha","IT",49000,22))
    emp.add(Employee(3,"Harika","ECE",48000,23))
    for (Employee in emp)
        println("${Employee.id} ${Employee.name} ${Employee.dept} ${Employee.salary} ${Employee.age}")
}



