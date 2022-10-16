package lecture09.kotlin

class Person(
    val name: String = "홍길동",
    var age: Int = 1,
) {

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이(${age})는 1이상이어야 합니다.");
        }
    }
}
