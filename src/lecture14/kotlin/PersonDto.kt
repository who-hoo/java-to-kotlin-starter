package lecture14.kotlin

data class PersonDto(
    val name: String,
    val age: Int
)

fun main() {
    val person1 = PersonDto("홍길동", 100)
    val person2 = PersonDto("홍길동", 200)
    println(person1)
    println(person2)
    println(person1 == person2)
}
