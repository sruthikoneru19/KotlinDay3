fun main(args: Array<String>) {
    val text1 = """My college Stanley  
        |is ranked 1st best college
        |in Hyderabad
        """
    println(text1)

    val text = text1.trimMargin()
    println(text)
}