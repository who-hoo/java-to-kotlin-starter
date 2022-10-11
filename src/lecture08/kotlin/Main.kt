package lecture08.kotlin

fun max(a: Int, b: Int): Int = if (a > b) a else b

fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}

fun main() {
    repeat("Hello World")
    repeat("Hello World", useNewLine = false)

    val arr = arrayOf("a", "b", "c")
    printAll("a", "b", "C")
    printAll(*arr)
}
