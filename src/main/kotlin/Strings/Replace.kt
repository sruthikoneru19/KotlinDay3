package Strings

fun main(args: Array<String>) {

    var str = " Sruthi Koneru"
    val oldValue = "SRUTHI"
    val newValue = "S"

    val output = str.replace(oldValue, newValue,ignoreCase=true)
    val output1 = str.replace(oldValue, newValue,ignoreCase=false)

    println(output)
    println(output1)
}