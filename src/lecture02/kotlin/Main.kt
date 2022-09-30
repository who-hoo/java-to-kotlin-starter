package lecture02.kotlin

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

fun addOne(number: Long?): Long {
    number ?: return 0
    return number + 1
}

fun main() {
    val str: String? = null
    println(str?.length)
    println(str?.length ?: 0)
}
