package lecture12.kotlin

import lecture12.java.Movable

fun main() {
    moveSomething(object : Movable {

        override fun move() {
            println("뚜벅 뚜벅")
        }

        override fun fly() {
            println("파닥 파닥")
        }
    })
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}
