open class Person (var name: String) {
    fun sleep() {
        println("$name sleeps")
    }

    open fun drink() {
        println("$name drinks water")
    }

    override fun toString() : String {
        return "name = $name"
    }
}

class Programmer(name : String, salary : Int) : Person(name) {
    var salary = 1
        get() = field
        set(value) {
            if (value > 0) field = value else throw IllegalArgumentException("salary must be > 0.")
        }

    init {
        this.salary = salary
    }

    override fun drink() {
        println("$name drinks energy drink")
    }

    fun codeApps() {
        println("$name code apps")
    }

    override fun toString() : String {
        return "name = $name, salary = $salary"
    }
}

fun main() {
    val tina = Programmer("tina", 4000)
    tina.salary = -2
}