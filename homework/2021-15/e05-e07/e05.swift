print("Give first number")
let userInputA : String? = readLine()
print("Give second number")
let userInputB : String? = readLine()

var a : Int? = Int(userInputA!)
var b : Int? = Int(userInputB!)

print("with !", a! + b!)

if let intA = a {
  if let intB = b {
    print("with multiple ifs", intA + intB)
  }
}

if let value1 = a, let value2 = b {
  print("with single if", value1 + value2)
}