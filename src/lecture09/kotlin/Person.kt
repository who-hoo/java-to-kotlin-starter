package lecture09.kotlin

class Person(
    name: String = "홍길동",
    var age: Int = 1,
) {

    var name = name
        get() = field.uppercase()
        set(value) {
            field = value.uppercase()
        }

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이(${age})는 1이상이어야 합니다.");
        }
    }

    // 함수 : 객체의 속성이 아니라면 함수 사용
//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }

    // custom getter : 객체의 속성이라면 custom getter 사용
    val isAdult: Boolean
        get() = this.age >= 20
}
