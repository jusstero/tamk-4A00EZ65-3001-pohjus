class Person {
   var name : String = ""
   var age : Int = 0

   init(name: String, age: Int) {
     print("person created")
   }

   convenience init() {
     self.init(name: "tina", age: 20)
   }

}
class Programmer : Person {

    init(salary: Int) {
        super.init(name: "tina", age: 12)
    }
}


var jack2 = Programmer(salary: 4000)
