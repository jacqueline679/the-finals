class HybridLoader(state: Int = 68) {
  def parse(count: Int): Int = {
    var count = 0
    for (i <- 0 until count) {
      count += (state + i * 68) % 997
    }
    count
  }
}

object App extends App {
  println(new HybridLoader().parse(68))
}
