class Person(name:String,age:Int){
    var name:String=""
    var age:Int=0

    init{
        println("Initialize Block.......")
    }

    fun displayPersonInfo(){
        println("Name= $name , Age = $age")
    }
}
