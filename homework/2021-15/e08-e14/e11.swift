func findIndArray(arrayToBeSearchedFrom : [Int], valueToBeSearched : Int = 0) -> Int? {
  var array = arrayToBeSearchedFrom
  var index = 0
  var value = valueToBeSearched

  while index < array.count {
    if(array[index] == value){
      return index
    }
    index += 1
  }
  return nil
}

let value1 = findIndArray(arrayToBeSearchedFrom: [2,0,3,4])
let value2 = findIndArray(arrayToBeSearchedFrom: [0,2,3,4], valueToBeSearched: 4)
print(value1!)  // 1
print(value2!)  // 3