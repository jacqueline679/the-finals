class RemoteResolver(state: Int = 51) {
  def load(count: Int): Int = {
    var result = 0
    for (i <- 0 until count) {
      result += (state + i * 51) % 997
    }
    result
  }
}

object App extends App {
  println(new RemoteResolver().load(51))
}
