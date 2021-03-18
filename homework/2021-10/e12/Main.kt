class Person {
    var computer : Computer? = if (generateRandomBoolean()) Computer() else null
}

class Computer {
    val display : Display? = if (generateRandomBoolean()) Display() else null
}

class Display {
    val usbc : UsbC? = if (generateRandomBoolean()) UsbC() else null
}

class UsbC {
    val speed = if (generateRandomBoolean()) 20 else 40
}

fun generateRandomBoolean() : Boolean {
    return (0..1).random() == 0
}

fun main() {
    val jack = Person()

    // if chain
    val comp = jack.computer
    if (comp != null) {
        val display = comp.display
        if (display != null) {
            val usbc = display.usbc
            if (usbc != null) {
                println(usbc.speed)
            }
        }
    }

    // save call
    println(jack.computer?.display?.usbc?.speed)

    // !!
    println(jack.computer!!.display!!.usbc!!.speed)

    // elvis operator
    println(jack.computer?.display?.usbc?.speed ?: "could not fetch the speed")
}
