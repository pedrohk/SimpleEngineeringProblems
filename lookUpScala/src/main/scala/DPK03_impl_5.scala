object DPK03_impl_5 {
  val data = List((1, "John"), (2, "Alice"), (3, "Bob"))
  def lookup(k: Int): String = {
    var xs = data
    var r = ""
    var stop = false
    while xs.nonEmpty && !stop do {
      if xs.head._1 == k then {
        r = xs.head._2
        stop = true
      }
      xs = xs.tail
    }
    r
  }
}
