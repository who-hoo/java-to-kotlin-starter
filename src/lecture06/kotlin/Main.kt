package lecture06.kotlin

fun main() {
    // for-each
    val numbers = listOf(1L, 2L, 3L)
    for (number in numbers) {
        println(number)
    }

    // for(up)
    for (i in 1..3) {
        println(i)
    }

    // for(down)
    for (i in 3 downTo 1) {
        println(i)
    }

    // for(step)
    for (i in 1..5 step 2) {
        println(i)
    }

    // while
    var i = 1;
    while (i <= 3) {
        println(i++)
    }
}
