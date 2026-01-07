object DPK03_impl_10 {
  val data = List((1, "John"), (2, "Alice"), (3, "Bob"))

  def lookup(k: Int): String = {
    var r = ""
    var xs = data
    while xs.nonEmpty do {
      val pair = xs.head
      if pair._1 == k then r = pair._2
      xs = xs.tail
    }
    r
  }
}
