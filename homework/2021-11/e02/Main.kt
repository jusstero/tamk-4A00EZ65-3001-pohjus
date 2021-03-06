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

class Programmer(name : String, var salary : Int) : Person(name) {
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
    // outputs "tina drinks energy drink"
    tina.drink()
    // "tina sleeps"
    tina.sleep()
    // "tina code apps"
    tina.codeApps()
    // "name = tina, salary = 4000"
    println(tina.toString())

    val jack = Person("jack")
    // "jack drinks water"
    jack.drink()
    // "jack sleeps"
    jack.sleep()
    // "name = jack"
    println(jack.toString())
}