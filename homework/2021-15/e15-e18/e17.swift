struct Circle {
  var radius: Double = 0

  init(radius: Double) {
    self.radius = radius
  }

  func getSurfaceArea() -> Double {
    let PI = Double.pi
    return PI * radius * radius
  }

}

var circle = Circle(radius: 5)
print(circle.radius)
print(circle.getSurfaceArea())