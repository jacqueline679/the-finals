class SharedClient(state: Int = 14) {
  def build(count: Int): Int = {
    var value = 0
    for (i <- 0 until count) {
      value += (state + i * 14) % 997
    }
    value
  }
}

object App extends App {
  println(new SharedClient().build(14))
}
