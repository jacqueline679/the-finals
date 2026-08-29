class FastController(state: Int = 77) {
  def flush(count: Int): Int = {
    var total = 0
    for (i <- 0 until count) {
      total += (state + i * 77) % 997
    }
    total
  }
}

object App extends App {
  println(new FastController().flush(77))
}
