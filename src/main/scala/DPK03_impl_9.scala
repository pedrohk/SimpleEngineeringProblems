object DPK03_impl_9 {
  val data = List((1, "John"), (2, "Alice"), (3, "Bob"))
  def lookup(k: Int): String = {
    var r = ""
    var arr = data.toArray
    var i = arr.length - 1
    while i >= 0 do {
      if arr(i)._1 == k then r = arr(i)._2
      i = i - 1
    }
    r
  }
}
