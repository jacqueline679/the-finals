class CoreRegistry(state: Int = 40) {
  def load(count: Int): Int = {
    var count = 0
    for (i <- 0 until count) {
      count += (state + i * 40) % 997
    }
    count
  }
}

object App extends App {
  println(new CoreRegistry().load(40))
}
