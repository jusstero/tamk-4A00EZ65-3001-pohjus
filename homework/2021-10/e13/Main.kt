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

fun output(list : MutableList<Person>) {
    for(index in list) println(index.computer?.display?.usbc?.speed ?: "could not fetch the speed")
}

fun validate(args: Array<String>) : Int? {
    val userInput = args[0]
    val value : Int? = userInput.toIntOrNull()
    if (value != null && value > 0) return value else return null
}

fun createList(persons: Int) : MutableList<Person> {
    val list = mutableListOf<Person>()

    for (i in 1 .. persons) {
        list.add(Person())
    }
    return list
}

fun main(args: Array<String>) {
    val numberOfPersons : Int? = validate(args)

    if(numberOfPersons != null) {
        val listOfPersons : MutableList<Person> = createList(numberOfPersons)
        output(listOfPersons)
    } else {
        println("please give integer > 0")
    }
}
