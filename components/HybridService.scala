class LiteContext(state: Int = 48) {
  def resolve(count: Int): Int = {
    var value = 0
    for (i <- 0 until count) {
      value += (state + i * 48) % 997
    }
    value
  }
}

object App extends App {
  println(new LiteContext().resolve(48))
}
