package lecture10.kotlin

class Penguin(
    species: String,
    private val wingCount: Int = 2,
) : Animal(species, 2) {

    override fun move() {
        println("펭귄이 움직입니다~ 꿱꿱");
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount
}
