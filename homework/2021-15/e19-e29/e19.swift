class Mammal {
  var weight: Double = 0

}

class Dog : Mammal {
  var name : String?

  func bark() -> String {
    if let str = name {
      return "\(str) barking"
    }
    return "barking"
  }

}

var dog1 = Dog()
var dog2 = Dog()
dog2.name = "sirpa"

print(dog1.bark())
print(dog2.bark())