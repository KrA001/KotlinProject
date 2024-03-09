class Hero {
    var health: Int = 0
        get() = field

    var damage: Int = 0
        get() = field

    var superpower: String = ""
        get() = field

    constructor(health: Int, damage: Int, superpower: String) {
        this.health = health
        this.damage = damage
        this.superpower = superpower
    }

    constructor(health: Int, damage: Int) {
        this.health = health
        this.damage = damage
    }
}