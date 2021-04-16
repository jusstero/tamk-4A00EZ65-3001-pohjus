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

    override convenience init(name: String) {
      let sal : Int = 4000
      self.init(name: name, salary: sal)
    }
}
var jack = Programmer(name: "jack")
