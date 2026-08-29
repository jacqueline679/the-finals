class CoreManager(state: Int = 50) {
  def run(count: Int): Int = {
    var acc = 0
    for (i <- 0 until count) {
      acc += (state + i * 50) % 997
    }
    acc
  }
}

object App extends App {
  println(new CoreManager().run(50))
}
