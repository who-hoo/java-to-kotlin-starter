package lecture10.kotlin

class Penguin(
    species: String,
    private val wingCount: Int = 2,
    override val swimAbility: Int = 3,
) : Animal(species, 2), Swimable, Flyable {

    override fun move() {
        println("펭귄이 움직입니다~ 꿱꿱");
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }
}
