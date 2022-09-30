package lecture02.kotlin

import lecture02.java.Person
import java.lang.IllegalArgumentException

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWithA(str: String?): Boolean {
    return str!!.startsWith("A")
}

fun startsWithB(str: String): Boolean {
    return str.startsWith("B")
}

fun addOne(number: Long?): Long {
    number ?: return 0
    return number + 1
}

fun main() {
    val str: String? = null
    println(str?.length)
    println(str?.length ?: 0)

//    println(startsWithA("ABC"))
//    println(startsWithA(null))

    val person = Person(null)
    startsWithB(person.name)
}
