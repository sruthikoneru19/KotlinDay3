package Collections

fun main()
{
    var players=mutableMapOf<String,String>()
    players.put("Sachin","is a batsman")
    players.put("Dravid","is a batsman")
    players.put("Dhoni","is a bowler")
    players.put("Shami","is a bowler")
    players.put("Bumrah","is a bowler")
    players.put("Dhoni","is a cocah")

    println(players)
    println("size = ${players.size}")

    println("keys ${players.keys}")
    println("value ${players.values}")
    println(players.get("Dravid"))

    println("--------")

    for (key in players.keys)
        println(key)
    println("----------")

    for(keyValue in players.entries)
        println(keyValue)

}


