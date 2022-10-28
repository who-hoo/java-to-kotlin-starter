package lecture19

import lecture19.a.printHelloWorld as printHelloWorldA
import lecture19.b.printHelloWorld as printHelloWorldB

typealias FruitFilter = (Fruit) -> Boolean

fun filterFruits(fruits: List<Fruit>, filter: FruitFilter) {

}

data class UltraSuperGuardianTribe(
    val name: String
)

typealias USGTMap = Map<String, UltraSuperGuardianTribe>

fun main() {
    printHelloWorldA()
    printHelloWorldB()
}
