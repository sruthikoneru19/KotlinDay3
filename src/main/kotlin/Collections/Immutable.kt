package Collections

fun main(){
    var marks = mutableListOf<Int>(20,30,40,20)
    println(marks)

    /*for(mark in marks)
        print(marks)*/

    marks.add(50)
    marks.add(34)
    println(marks)
    println("size ${marks.size}")
    println("contains 200 ${marks.contains(200)}")
}