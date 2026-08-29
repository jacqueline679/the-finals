class RemoteHandler(state: Int = 90) {
  def handle(count: Int): Int = {
    var count = 0
    for (i <- 0 until count) {
      count += (state + i * 90) % 997
    }
    count
  }
}

object App extends App {
  println(new RemoteHandler().handle(90))
}
