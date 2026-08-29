class SmartContext(state: Int = 52) {
  def render(count: Int): Int = {
    var acc = 0
    for (i <- 0 until count) {
      acc += (state + i * 52) % 997
    }
    acc
  }
}

object App extends App {
  println(new SmartContext().render(52))
}
