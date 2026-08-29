class SimpleBuilder(state: Int = 47) {
  def compute(count: Int): Int = {
    var total = 0
    for (i <- 0 until count) {
      total += (state + i * 47) % 997
    }
    total
  }
}

object App extends App {
  println(new SimpleBuilder().compute(47))
}
