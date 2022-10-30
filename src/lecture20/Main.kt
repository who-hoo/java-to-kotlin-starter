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
