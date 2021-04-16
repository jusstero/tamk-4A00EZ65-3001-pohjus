class Mammal {
  var weight: Double = 0

}

class Human : Mammal {
  var name: String?

  func createArt() -> String {
    if let str = name {
      return "\(str) creates art"
    }
    return "creates art"
  }
}

class Dog : Mammal {
  var name: String?

  func bark() -> String {
    if let str = name {
      return "\(str) barking"
    }
    return "barking"
  }

}

func printWeight(mammal: Mammal) {
  print (mammal.weight)
}

var dog1 = Dog()
var dog2 = Dog()
dog2.name = "sirpa"
dog2.weight = 20

print(dog1.bark())
print(dog2.bark())

var jack = Human()
jack.name = "jack"
jack.weight = 80
print(jack.createArt())

printWeight(mammal: jack)
printWeight(mammal: dog2)