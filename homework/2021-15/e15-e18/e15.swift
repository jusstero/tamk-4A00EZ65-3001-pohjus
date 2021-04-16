class PointC {
  var x = 0
  var y = 0

}

struct PointS {
  var x = 0
  var y = 0
}

let a = PointC()
let b = PointS()


var referenceA = a
var copyB = b

referenceA.x = 5
copyB.y = 10

// 5
print(a.x)
// 0
print(b.y)

let test1 = PointS(x: 0, y: 1)
print(test1.y)

// error: argument passed to call that takes no arguments
// let test2 = PointC(x: 0, y: 1)