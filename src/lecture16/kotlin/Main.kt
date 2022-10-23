package lecture16.kotlin

import lecture16.java.Person

fun main() {
    val str = "ABC"
    println(str.lastChar())

    val person = Person("홍길동", 10)
    println(person.nextYearAge())

    val train: Train = Train()
    train.isExpensive() // Train의 확장함수

    val srt1: Train = Srt()
    srt1.isExpensive() // Train의 확장함수

    val srt2: Srt = Srt()
    srt2.isExpensive() // Srt의 확장함수

    println(1.add(2))
    println(1.infixAdd(2))
    println(1 infixAdd 2)
}

fun String.lastChar(): Char {
    return this[this.length - 1]
}

fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}

open class Train(
    val name: String = "새마을기차",
    val price: Int = 5_000
)

fun Train.isExpensive(): Boolean {
    println("Train의 확장함수")
    return this.price >= 10000
}

class Srt : Train("SRT", 40_000)

fun Srt.isExpensive(): Boolean {
    println("Srt의 확장함수")
    return this.price >= 10000
}

fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.infixAdd(other: Int): Int {
    return this + other
}

inline fun Int.inlineAdd(other: Int): Int {
    return this + other
}
