package lecture05.kotlin

fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }
}

fun isValidScore(score: Int): Boolean {
    return score in 0..100
}

fun getPassOrFail(score: Int): String {
    // expression
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}

fun getGradeWithWhenV1(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun getGradeWithWhenV2(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumberV1(number: Int) {
    when (number) {
        -1, 0, 1 -> println("O")
        else -> println("X")
    }
}

fun judgeNumberV2(number: Int) {
    when {
        number == 0 -> println("0")
        number % 2 == 0 -> println("짝")
        else -> println("홀")
    }
}
