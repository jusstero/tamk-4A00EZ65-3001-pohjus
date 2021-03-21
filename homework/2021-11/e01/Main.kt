class Person (var name: String) {}

class Circle (var radius: Int) {
    var color: String? = null

    constructor(radius: Int, color: String) : this(radius) {
        this.color = color
    }

    fun printSurfaceArea() {
        println(3.14 * radius * radius)
    }

    fun attributesToString() : String {
        if (color == null) return "radius = $radius" else return "radius = $radius , color = $color"
    }
}

fun main() {
    var jack = Person("jack smith")
    println(jack.name)

    val c = Circle(radius = 5, color = "red")
    println(c.radius)      // 5
    c.printSurfaceArea()   // outputs the surface area of the circle, 78.53981633974483
    println(c.attributesToString())  // radius = 5, color = red


    val c1 = Circle(radius = 5, color = "red")
    val c2 = Circle(radius = 5)
    println(c1.attributesToString())
    println(c2.attributesToString())
}
