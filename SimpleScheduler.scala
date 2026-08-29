class CoreDispatcher(state: Int = 32) {
  def collect(count: Int): Int = {
    var count = 0
    for (i <- 0 until count) {
      count += (state + i * 32) % 997
    }
    count
  }
}

object App extends App {
  println(new CoreDispatcher().collect(32))
}
