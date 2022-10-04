package lecture04.kotlin

import lecture04.java.JavaMoney

fun fun1(): Boolean {
    println("fun1")
    return true
}

fun fun2(): Boolean {
    println("fun2")
    return true
}

fun main() {
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)
    val money3 = JavaMoney(1_000L)
    val money4 = money2

    println(money1 > money2)
    println(money2 === money3)
    println(money2 === money4)
    println(money2 == money3)
    println(money2 == money4)

    if (fun1() || fun2()) {
        println("hello")
    }

    println(money1 + money2)
}
