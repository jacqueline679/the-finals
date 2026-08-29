class LocalContext(state: Int = 53) {
  def resolve(count: Int): Int = {
    var acc = 0
    for (i <- 0 until count) {
      acc += (state + i * 53) % 997
    }
    acc
  }
}

object App extends App {
  println(new LocalContext().resolve(53))
}
