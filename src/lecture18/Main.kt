package lecture18


fun main() {
    val fruits = listOf(
        Fruit(1, "사과", 1_000, 1_000),
        Fruit(2, "사과", 1_200, 1_200),
        Fruit(3, "사과", 1_200, 1_200),
        Fruit(4, "사과", 1_500, 1_500),
        Fruit(5, "바나나", 3_000, 3_000),
        Fruit(6, "바나나", 3_200, 3_200),
        Fruit(7, "바나나", 2_500, 2_500),
        Fruit(8, "수박", 10_000, 10_000)
    )

    val apples = fruits.filter { fruit -> fruit.name == "사과" }
    val apples2 = fruits.filterIndexed { idx, fruit ->
        println(idx)
        fruit.name == "사과"
    }
    val applePrices = fruits.filter { fruit -> fruit.name == "사과" }
        .map { fruit -> fruit.currentPrice }
    val applePrices2 = fruits.filter { fruit -> fruit.name == "사과" }
        .mapIndexed { idx, fruit ->
            println(idx)
            fruit.currentPrice
        }
    filterFruits(fruits) { fruit -> fruit.name == "사과" }
    val isAllApple = fruits.all { fruit -> fruit.name == "사과" }
    val isNoApple = fruits.none { fruit -> fruit.name == "사과" }
    val isAnyApple = fruits.any { fruit -> fruit.name == "사과" }
    val count = fruits.count()
    val sortedFruitByCurrentPrice = fruits.sortedBy { fruit -> fruit.currentPrice }
    val descSortedFruitByCurrentPrice = fruits.sortedByDescending { fruit -> fruit.currentPrice }
    val distinctFruitNames = fruits.distinctBy { fruit -> fruit.name }
        .map { fruit -> fruit.name }
    val firstFruit = fruits.firstOrNull()
    val lastFruit = fruits.lastOrNull()
    val map: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }
    val map2: Map<Long, Fruit> = fruits.associateBy { fruit -> fruit.id }
    val map3: Map<String, List<Long>> = fruits
        .groupBy({ fruit -> fruit.name }, { fruit -> fruit.factoryPrice })
    val map4: Map<Long, Long> = fruits
        .associateBy({ fruit -> fruit.id }, { fruit -> fruit.factoryPrice })
    val map5: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }
        .filter { (key, value) -> key == "사과" }

    val fruitsInList: List<List<Fruit>> = listOf(
        listOf(
            Fruit(1, "사과", 1_000, 1_000),
            Fruit(2, "사과", 1_200, 1_200),
            Fruit(3, "사과", 1_200, 1_200),
            Fruit(4, "사과", 1_500, 1_500)
        ),
        listOf(
            Fruit(5, "바나나", 3_000, 3_000),
            Fruit(6, "바나나", 3_200, 3_200),
            Fruit(7, "바나나", 2_500, 2_500)
        ),
        listOf(
            Fruit(8, "수박", 10_000, 10_000)
        )
    )
    val samePriceFruits = fruitsInList.flatMap { list ->
        list.filter { fruit -> fruit.factoryPrice == fruit.currentPrice }
    }
    val flatFruit = fruitsInList.flatten()
}

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    return fruits.filter(filter)
}
