fun main(args: Array<String>) {
    val boss: Boss =Boss(20,10,"Защита")
    println(boss.health)
    println(boss.damage)
    println(boss.protection)

    println("-------------------------------")

    for (i in createHeroes()){
        println("health ${i.health} damage ${i.damage} superpower ${i.superpower}")
    }
}

fun createHeroes(): Array<Hero>{
    val warrior: Hero = Hero(100,20)
    val mag: Hero = Hero(50,100,"Огненный шар")
    val golem: Hero = Hero(250,20)

    val heroList = arrayOf(warrior,mag,golem)

    return heroList
}