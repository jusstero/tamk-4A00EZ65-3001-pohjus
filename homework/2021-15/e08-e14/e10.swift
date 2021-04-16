import Foundation

func getPersonInformation() -> (String, Date) {
  let personName = "Pekka Virtanen"
  let personBDay = Date(timeIntervalSinceReferenceDate: 118800)

  let person : (name: String, birthday: Date) = (name: personName, birthday: personBDay)
  return person

}

print(getPersonInformation().0)
print(getPersonInformation().1)
