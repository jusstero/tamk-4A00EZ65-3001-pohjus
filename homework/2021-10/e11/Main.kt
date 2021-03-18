fun main() {
    var t1 = Thread() {
        for(i in 1..5) {
            val thName = Thread.currentThread()
            println("$thName : $i")
            Thread.sleep(500)
        }
    }
    var t2 = Thread() {
        for(i in 1..5) {
            val thName = Thread.currentThread()
            println("$thName : $i")
            Thread.sleep(500)
        }
    }
    t1.start()
    t2.start()
}