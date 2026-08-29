class BatchFactory(state: Int = 46) {
  def compute(count: Int): Int = {
    var value = 0
    for (i <- 0 until count) {
      value += (state + i * 46) % 997
    }
    value
  }
}

object App extends App {
  println(new BatchFactory().compute(46))
}
