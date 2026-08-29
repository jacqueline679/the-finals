class SimpleScheduler(state: Int = 24) {
  def dispatch(count: Int): Int = {
    var value = 0
    for (i <- 0 until count) {
      value += (state + i * 24) % 997
    }
    value
  }
}

object App extends App {
  println(new SimpleScheduler().dispatch(24))
}
