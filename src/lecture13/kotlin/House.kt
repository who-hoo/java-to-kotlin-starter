package lecture13.kotlin

class House(
    private val address: String,
    private val livingRoom: LivingRoom
) {

    class LivingRoom(
        private val area: Double
    )

//    inner class LivingRoom(
//        private val area: Double
//    ) {
//        val address: String
//            get() = this@House.address
//    }
}
