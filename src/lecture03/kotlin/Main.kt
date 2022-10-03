package lecture03.kotlin

import lecture03.java.Person

fun printAgeIfPerson(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}

fun personInformation(person: Person) : String {
    return "사람의 이름은 ${person.name}이고 나이는 ${person.age}세 입니다."
}

fun main() {
    val number1 = 4
    val number2: Long = number1.toLong() // 명시적 형변환 필요
    println(number1 + number2)

    val person = Person("who-hoo", 100)
    printAgeIfPerson(null)
    printAgeIfPerson(person)

    println(personInformation(person))

    val multilineStr = """
        여러 줄로
        작성하는
        문자열!!!
    """.trimIndent()
    println(multilineStr)

    val str = "abcdefg"
    println(str[0])
}
