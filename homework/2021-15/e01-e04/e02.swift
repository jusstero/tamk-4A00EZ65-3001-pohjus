/*

var a = 5
var b = 5.5

var sum1 = a + b
print(sum1)
*/
// error: binary operator '+' cannot be applied to operands of type 'Int' and 'Double'

var x = 5
var y = 5.5

var sum2 = Double(x) + y
print(sum2)