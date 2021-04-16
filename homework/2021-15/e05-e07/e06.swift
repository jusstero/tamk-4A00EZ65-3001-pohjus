struct Person {
    // initializes computer to Computer() object or nil
    var computer : Computer? = Bool.random() ? Computer() : nil
}

struct Computer {
  var soundCard : SoundCard? = Bool.random() ? SoundCard() : nil
}

struct SoundCard {
  var name : String? = Bool.random() ? "SoundBlaster" : nil
}

let jack = Person()
print(jack.computer?.soundCard?.name)
print(jack.computer!.soundCard!.name)