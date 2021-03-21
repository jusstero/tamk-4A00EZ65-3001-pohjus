interface Drawable {
    fun draw()
}

data class Rectangle(var width : Int, var height : Int) : Drawable {
    override fun draw() {
        for (i in 1..height) {
            for (j in 1..width) {
                print("X")
            }
            println()
        }
        println()
    }

}

data class RectTriangle(var height : Int) : Drawable {
    override fun draw() {
        for (i in 1..height) {
            for (j in 1..i) {
                print("X")
            }
            println()
        }
        println()
    }

}

fun generateRandomBoolean() : Boolean {
    return (0..1).random() == 0
}

fun generateRandomArray(amount : Int) : MutableList<Drawable> {
    var list = mutableListOf<Drawable>()
    var size = 3..5

    for (i in 1..amount) {
        if (generateRandomBoolean()) {
            list.add(Rectangle(size.random(), size.random()))
        } else {
            list.add(RectTriangle(size.random()))
        }
    }

    return list
}

fun main() {
    val drawables : MutableList<Drawable> = generateRandomArray(5)
    for (shape in drawables) shape.draw()
}