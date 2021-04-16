let tuple : (a: Double, b: Int) = (a: 5.5, b: 25)

var tupleDouble = tuple.a
var tupleInt = tuple.b
print(tupleDouble, tupleInt)

var (double, _) = tuple
print(double)

var person : (name: String,
            address: (line: String,
            city: String,
            zip: String,
            country: String))
            =
            (name: "jack", address: (
            line: "Hämeenkatu",
            city: "Tampere",
            zip: "33100",
            country: "Finland"))

print(person)

