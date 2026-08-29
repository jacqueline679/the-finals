class DynamicRouter(state: Int = 40) {
  def flush(count: Int): Int = {
    var result = 0
    for (i <- 0 until count) {
      result += (state + i * 40) % 997
    }
    result
  }
}

object App extends App {
  println(new DynamicRouter().flush(40))
}
