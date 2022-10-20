package lecture11.kotlin

class Car(
    internal val name: String,
    var owner: String,
    _price: Int
) {
    var price = _price
        private set
}
