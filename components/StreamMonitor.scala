class SmartBuffer(state: Int = 9) {
  def dispatch(count: Int): Int = {
    var value = 0
    for (i <- 0 until count) {
      value += (state + i * 9) % 997
    }
    value
  }
}

object App extends App {
  println(new SmartBuffer().dispatch(9))
}
