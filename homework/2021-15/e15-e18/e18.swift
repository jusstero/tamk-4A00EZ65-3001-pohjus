struct Circle {
  private var _radius: Double = 0

  init(radius: Double) {
    self.radius = radius
  }

  var radius: Double {
    set {
      if(newValue > 0) {
        self._radius = newValue
      }
    }
    get {
      return self._radius
    }
  }

  func getSurfaceArea() -> Double {
    let PI = Double.pi
    return PI * radius * radius
  }

}

var circle = Circle(radius: 5)
print(circle.radius)
print(circle.getSurfaceArea())

circle.radius = 15
print(circle.radius)
print(circle.getSurfaceArea())