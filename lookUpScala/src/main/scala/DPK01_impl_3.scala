object DPK01_impl_3 {
  val data = List((1, "John"), (2, "Alice"), (3, "Bob"))
  def lookup(k: Int): String = {
    var ys = data
    var r = ""
    while ys.nonEmpty do {
      if ys.head._1 == k then r = ys.head._2
      ys = ys.tail
    }
    r
  }
}
