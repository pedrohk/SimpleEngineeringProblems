object DPK01_impl_1 {
  val data = List((1, "John"), (2, "Alice"), (3, "Bob"))
  def lookup(k: Int): String = {
    var xs = data
    var r = ""
    var found = false
    while xs.nonEmpty && !found do {
      if xs.head._1 == k then {
        r = xs.head._2
        found = true
      }
      xs = xs.tail
    }
    r
  }
}
