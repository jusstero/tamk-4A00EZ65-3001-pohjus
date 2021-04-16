class Person {
    private var name : String?

    init(name: String) {
        self.name = name
    }
}
class Programmer : Person {
    private var salary : Int?
    init(name: String, salary : Int) {
        //self.name = name
        self.salary = salary
        super.init(name: name)
    }
}
var jack = Programmer(name: "jack", salary: 4000)
