package lecture20

class Person(
    val name: String,
    var age: Int
)

fun printPersonV1(person: Person?) {
    if (person != null) {
        println(person.name)
        println(person.age)
    }
}

fun printPersonV2(person: Person?) {
    person?.let {
        println(person.name)
        println(person.age)
    }
}

fun main() {
    val person = Person("홍길동", 100)
    val value1 = person.let { it.age }
    println(value1)
    val value2 = person.run { this.age }
    println(value2)
    val value3 = person.also { it.age }
    println(value3)
    val value4 = person.apply { this.age }
    println(value4)
    with(person) {
        println(name)
        println(age)
    }
}
