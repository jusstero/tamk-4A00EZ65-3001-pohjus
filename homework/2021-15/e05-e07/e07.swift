class Mammal { }

class Dog : Mammal {
  func wuh() -> Void {
      print("Wuh Wuh!");
  }
}

class Cat : Mammal {
  func meow() -> Void {
      print("Meow!");
  }
}

func main() {
  var mammals = [Mammal]();
  for _ in 1...5 {
      Bool.random() ? mammals.append(Cat()) : mammals.append(Dog());
  }

  for Mammal in mammals {
      if let x = Mammal as? Dog {
        x.wuh();
      }
      if let y = Mammal as? Cat {
        y.meow();
      }
    }
}

main();