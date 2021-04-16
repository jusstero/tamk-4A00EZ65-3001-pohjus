class PersonA {
  var name: String  = ""
  var age: Int = 0

}

class PersonB {
  var name: String?
  var age: Int?

}

class PersonC {
  var name: String
  var age: Int

  init() {
    self.name = ""
    self.age = 0
  }
}

var a = PersonA()
var b = PersonB()
var c = PersonC()
