package lecture15.kotlin

fun main() {
    val array = arrayOf(100, 200)
    array.plus(300)

    for (i in array.indices) { // 0부터 마지막 index까지의 range
        println("$i ${array[i]}")
    }

    for ((idx, value) in array.withIndex()) { // 인덱스와 값을 한 번에 가져올 수 있다.
        println("$idx $value")
    }

    val numbers = listOf(100, 200) // 불변 리스트 생성
    val emptyList = emptyList<Int>() // 빈 리스트를 만들 때는 타입 생략 불가
    printNumbers(emptyList()) // 타입 추론이 가능할 때는 타입 생략
    // 하나를 가져오기
    println(numbers[0])
    // for each
    for (number in numbers) {
        println(number)
    }
    // 전통적인 for문
    for ((idx, number) in numbers.withIndex()) {
        println("$idx $number")
    }

    val mutableNumbers = mutableListOf(100, 200) // 가변 리스트 생성
    mutableNumbers.add(300)

    val numberSet = setOf(100, 200) // 불변 셋 생성
    // for each
    for (number in numberSet) {
        println(number)
    }
    // 전통적인 for문
    for ((idx, number) in numberSet.withIndex()) {
        println("$idx $number")
    }

    val mutableNumberSet = mutableSetOf(100, 200) // 가변 셋 생성

    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    val newMap = mapOf(1 to "MONDAY", 2 to "TUESDAY")
    for (key in newMap.keys) {
        println(key)
        println(newMap[key])
    }
    for ((key, value) in newMap.entries) {
        println(key)
        println(value)
    }
}

private fun printNumbers(numbers: List<Int>) {
    for (number in numbers) {
        println(number)
    }
}
