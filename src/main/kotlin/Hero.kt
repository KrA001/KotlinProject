class Hero {
    var health: Int = 0
        private set

    var damage: Int = 0
        private set
    var superpower: String = ""
        private set
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