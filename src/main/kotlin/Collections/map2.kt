fun main()
{
    var products = mutableMapOf<String,Int>("laptop" to 20000,"smart watch" to 1000,"cloth" to 250)
    println(products)

    for (keyValue in products.entries)
    {
        println("$keyValue , ${keyValue.key} ,${keyValue.value}")
    }

}



