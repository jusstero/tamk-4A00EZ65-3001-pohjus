var minValue = Int.min
var maxValue = Int.max

print(minValue, maxValue)

var uInt8Max = UInt8.max
print(uInt8Max)

/* exited, illegal instruction
uInt8Max += 1
print(uInt8Max)
*/

var negative = -8
var positive = 8

// prints 16
print(negative.distance(to: positive))
print(abs(negative))

