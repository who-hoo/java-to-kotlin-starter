package lecture09.kotlin

import lecture09.java.JavaPerson

fun main() {
    val person = Person("who-hoo", 100)
    println(person.name)
    person.age = 10
    println(person.age)

    val baby = Person("baby")
    println(baby.name)
    println(baby.age)

    val hgd = Person()
    println(hgd.name)
    println(hgd.age)

    val javaPerson = JavaPerson("who-hoo", 100)
    println(javaPerson.name)
    javaPerson.age = 10
    println(javaPerson.age)
}
