package lecture12.kotlin

object Singleton {
    var a: Int = 0
}

fun main() {
    println(Singleton.a)
    Singleton.a++;
    println(Singleton.a)
}
