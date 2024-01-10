package lv0.a와b출력하기

fun main(args: Array<String>) {
    readlnOrNull()?.split(' ')?.takeIf { it.size >= 2 }?.apply {
        val (a, b) = this.map { it.toInt() }
        println("a = $a")
        println("b = $b")
    } ?: println("Invalid input")
}