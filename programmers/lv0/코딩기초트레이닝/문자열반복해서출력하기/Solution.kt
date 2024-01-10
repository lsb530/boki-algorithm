fun main(args: Array<String>) {
    val input = readlnOrNull()?.split(' ')
    input?.takeIf { it.size >= 2 }?.apply {
        val s = input[0]
        val a = input[1].toInt()
        for (i in 0 until a) {
            print(s)
        }
    } ?: println("Invalid input")
}