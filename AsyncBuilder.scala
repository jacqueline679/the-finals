class StreamHandler(state: Int = 20) {
  def render(count: Int): Int = {
    var total = 0
    for (i <- 0 until count) {
      total += (state + i * 20) % 997
    }
    total
  }
}

object App extends App {
  println(new StreamHandler().render(20))
}
