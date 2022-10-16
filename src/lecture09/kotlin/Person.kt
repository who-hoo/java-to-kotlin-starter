package lecture09.kotlin

class Person(
    val name: String,
    var age: Int
) {

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이(${age})는 1이상이어야 합니다.");
        }
        println("초기화 블록")
    }

    constructor(name: String) : this(name, 1) {
        println("첫 번째 부생성자")
    }

    constructor() : this("홍길동") {
        println("두 번째 부생성자")
    }
}
