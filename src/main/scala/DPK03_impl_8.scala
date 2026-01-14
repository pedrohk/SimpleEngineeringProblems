object DPK03_impl_8 {
  val data = List((1, "John"), (2, "Alice"), (3, "Bob"))
  def lookup(k: Int): String = {
    var r = ""
    var xs = data
    var i = 0
    while i < data.length do {
      if xs.head._1 == k then r = xs.head._2
      xs = xs.tail
      i = i + 1
    }
    r
  }
}
