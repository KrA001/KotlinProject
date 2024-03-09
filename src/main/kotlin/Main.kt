fun main(args: Array<String>) {
    val boss: Boss =Boss()
    boss.damage = 10
    boss.health = 20
    boss.protection ="защита"

    println(boss.health)
    println(boss.damage)
    println(boss.protection)

    println("-------------------------------")

    for (i in hel()){
        println("health ${i.health} damage ${i.damage} superpower ${i.superpower}")
    }
}

fun hel(): Array<Hero>{
    val warrior: Hero = Hero(100,20)
    val mag: Hero = Hero(50,100,"Огненный шар")
    val golem: Hero = Hero(250,20)

    val heroList = arrayOf(warrior,mag,golem)

    return heroList
}