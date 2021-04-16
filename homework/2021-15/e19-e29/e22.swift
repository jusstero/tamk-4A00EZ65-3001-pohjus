class Mammal {
  var weight: Double = 0

}

class Human : Mammal {
  var name: String?

  func createArt() {
    if let str = name {
      print ("\(str) creates art")
    } else {
      print ("creates art")
    }
  }
}

class Dog : Mammal {
  var name: String?

  func bark()  {
    if let str = name {
      print ("\(str) barking")
    } else {
      print ("barking")
    }
  }

}

func printWeight(mammal: Mammal) {
  print (mammal.weight)
}

func mammalDoSomething(mammal: Mammal) {
  if let dog = mammal as? Dog {
    dog.bark()
  } else if let human = mammal as? Human {
    human.createArt()
  }
}

var dog1 = Dog()
var dog2 = Dog()
dog2.name = "sirpa"
dog2.weight = 20

var jack = Human()
jack.name = "jack"
jack.weight = 80

mammalDoSomething(mammal: jack)
mammalDoSomething(mammal: dog2)
mammalDoSomething(mammal: dog1)
