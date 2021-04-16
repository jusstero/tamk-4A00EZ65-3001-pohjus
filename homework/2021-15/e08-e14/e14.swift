extension Int {
    func hello() {
        print("moro")
    }

    func repeats(task: () -> Void)  {
      for _ in 1 ... self {
        task()
      }
    }
}

3.hello()

3.repeats() {
  print("hello")
}

4.repeats() {
  print("jack")
}