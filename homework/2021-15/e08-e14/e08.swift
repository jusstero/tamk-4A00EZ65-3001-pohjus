func repeatName(personName: String, amount: Int) -> String {
  var str = ""

  for _ in 1...amount {
    str += personName
  }

  return str
}

print(repeatName(personName: "teemu", amount: 4))