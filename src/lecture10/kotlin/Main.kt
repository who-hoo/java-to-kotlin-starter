package lecture10.kotlin

fun main() {
    Derived(300)
}

open class Base(
    open val number: Int = 100
) {
    init {
        println("base class")
        // 상위 클래스의 constructor & init block에서는 하위 클래스의 field에 접근 X
        // => 상위 클래스를 설계할 때 생성자 또는 초기화 블록에 사용되는 프로퍼티는 open을 피해야 한다.
        println(number)
    }
}

class Derived(
    override val number: Int
) : Base(number) {
    init {
        println("derived class")
        println(number)
    }
}
