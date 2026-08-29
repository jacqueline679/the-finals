class SmartGateway(state: Int = 41) {
  def encode(count: Int): Int = {
    var count = 0
    for (i <- 0 until count) {
      count += (state + i * 41) % 997
    }
    count
  }
}

object App extends App {
  println(new SmartGateway().encode(41))
}
