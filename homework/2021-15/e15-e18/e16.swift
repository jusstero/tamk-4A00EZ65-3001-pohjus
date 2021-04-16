class PointC {
  var x = 0
  var y = 0

}

class PointS : Equatable {
    var x : Int = 0
    var y : Int = 0

    static func == (left: PointS, right: PointS) -> Bool {
        return (left.x == right.x)
    }
}


let e = PointS()
let f = PointS()
print(e == f)

/*
let g = PointS(x: 0, y: 8)
let h = PointS(x: 0, y: 9)
print(g == h)
*/


/*
struct PointS {
  var x = 0
  var y = 0
}


let a = PointC()
let b = PointC()
//false
print(a === b)


let c = PointC()
let d = c
//true
print(c === d)


let e = PointS()
let f = PointS()
// error: binary operator '===' cannot be applied to two 'PointS' operands
// print(e === f)

*/

