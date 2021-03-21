data class Person(var name : String, var age : Int)

fun generateRandomBoolean() : Boolean {
    return (0..1).random() == 0
}

fun generateName() : String {
    var random = (0..2).random()
    when(random) {
        0 -> return "tina"
        1 -> return "jack"
        else -> return "hannah"
    }
}

fun output(list : List<Person>) {
    for(index in list) println(index.toString())
    println("unique people: " + list.size)
}

fun validate(args: Array<String>) : Int? {
    val userInput = args[0]
    val value : Int? = userInput.toIntOrNull()
    if (value != null && value > 0) return value else return null
}

fun createList(persons: Int) : List<Person> {
    val list = mutableListOf<Person>()

    for (i in 1 .. persons) {
        var name = generateName()
        var age = (1..100).random()
        list.add(Person(name, age))
    }
    return list.distinct()
}

fun main(args: Array<String>) {
    val numberOfPeople : Int? = validate(args)

    if(numberOfPeople != null) {
        val personList : List<Person> = createList(numberOfPeople)
        output(personList)
    } else {
        println("please give integer > 0")
    }

    /*
    Default toString function returns spot in memory
    Default equals function compares memory spots of 2 objects

    Data class toString function returns properties of object
    Data class equals function compares properties of 2 objects
    Data class copy function copies properties from one object to another

    val jack1 = Person("jack", 30)
    val jack2 = Person("jack", 25)
    val jack3 = jack1.copy()

    println(jack1.toString())
    println(jack2.toString())
    println(jack1.equals(jack2))
    println(jack1.equals(jack3))
    */

}