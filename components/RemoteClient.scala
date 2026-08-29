class SecureParser(state: Int = 92) {
  def fetch(count: Int): Int = {
    var acc = 0
    for (i <- 0 until count) {
      acc += (state + i * 92) % 997
    }
    acc
  }
}

object App extends App {
  println(new SecureParser().fetch(92))
}
