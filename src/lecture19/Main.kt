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

//data class Person(
//    val name: String,
//    var age: Int
//)

class Person(
    val name: String,
    var age: Int
) {
    operator fun component1(): String {
        return this.name
    }

    operator fun component2(): Int {
        return this.age
    }
}

fun main() {
    printHelloWorldA()
    printHelloWorldB()

    val person = Person("홍길동", 100)
    val (name, age) = person
    println("${name}의 나이는 ${age}입니다.")

    val numbers = listOf(1, 2, 3)
    numbers.map { number -> number + 1 }
        .forEach { number -> println(number) }

    // break with forEach
    run {
        numbers.forEach { number ->
            if (number == 2) {
                return@run
            }
        }
    }

    //continue with forEach
    numbers.forEach { number ->
        if (number == 2) {
            return@forEach
        }
    }

    // label
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 2) {
                break@loop
            }
            println("${i} ${j}")
        }
    }
}
