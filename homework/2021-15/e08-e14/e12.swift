func success(index : Int) {
  print(index)
}

func fails(msg : String) {
  print(msg)
}

func findIndArray(arrayToBeSearchedFrom : [Int], valueToBeSearched : Int = 0, success: (Int) -> Void, fails: (String) -> Void) {
  var array = arrayToBeSearchedFrom
  var index = 0
  let value = valueToBeSearched
  var found = false
  while index < array.count {
    if(array[index] == value){
      found = true
      success(index)
    }
    index += 1
  }
  if(!found) {
    fails("Could not find value \(value)")
  }
}

findIndArray(arrayToBeSearchedFrom: [0,2,3,4], valueToBeSearched: 2, success: success, fails: fails)
findIndArray(arrayToBeSearchedFrom: [0,2,3,4], valueToBeSearched: -2, success: success, fails: fails)

//Prefined argument names
findIndArray(arrayToBeSearchedFrom: [0,2,3,4], valueToBeSearched: 2, success: {
  print($0)
},
fails: {
  print($0)
  })

// Trailing closure syntax
findIndArray(arrayToBeSearchedFrom: [0,2,3,4], valueToBeSearched: -2, success: {
  print($0)
}) {
  print($0)
  }