package lecture14.kotlin

sealed class HyandaiCar(
    val name: String,
    val price: Long
)

class Avante : HyandaiCar("avante", 1_000L)

class Sonata : HyandaiCar("sonata", 2_000L)

class Grandeur : HyandaiCar("grandeur", 3_000L)
