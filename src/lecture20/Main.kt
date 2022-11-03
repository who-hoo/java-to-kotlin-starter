package lecture20

class Person(
    val name: String,
    var age: Int
)

class PersonDto(
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

    //let
    // 하나 이상의 함수를 call chain 결과로 호출할 때
    val strings = listOf("APPLE", "CAR")
    strings.map { string -> string.length }
        .filter { length -> length > 3 }
        .let(::println)
    // non-null 값에 대해서만 code block을 실행시킬 때
    val strs: List<String?> = listOf("apple", null)
    val length = strs?.let { str ->
        println(str.upperCase())
        str.length
    }
    // 일회성으로 제한된 영역에 지역 변수를 만들 때
    val numbers = listOf("one", "two", "three")
    val modifiedFirstItem = numbers.first()
        .let { firstItem ->
            if (firstItem.length >= 5) firstItem else "!$firstItem!"
        }.uppercase()
    println(modifiedFirstItem)

    //run
    // 객체 초기화와 반환 값의 계산을 동시에 해야할 때
    // val person = Person("홍길동", 100).run(personRepository::save)

    //apply
    // 객체 설정을 할 때에 객체를 수정하는 로직이 call chain 중간에 필요할 때(ex.test fixture)
    fun createPerson(
        name: String,
        age: Int
    ): Person {
        return Person(
            name = name,
            age = 0
        ).apply { this.age = age }
    }

    //also
    // 객체를 수정하는 로직이 call chain 중간에 필요할 때
    mutableListOf("one", "two", "three")
        .also { println("The list elements before adding new one: $it") }
        .add("four")

    //with
    // 특정 객체를 다른 객체로 변환해야 하는데,
    // 모듈 간의 의존성에 의해 정적 팩토리 혹은 toClass 함수를 만들기 어려울 때
    fun withExample(person: Person) {
        return with(person) {
            PersonDto(name = name, age = age)
        }
    }
}
