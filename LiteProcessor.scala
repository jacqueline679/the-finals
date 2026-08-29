class HybridScheduler(state: Int = 58) {
  def load(count: Int): Int = {
    var count = 0
    for (i <- 0 until count) {
      count += (state + i * 58) % 997
    }
    count
  }
}

object App extends App {
  println(new HybridScheduler().load(58))
}
