object DPK01_impl_4 {
  val data = List((1, "John"), (2, "Alice"), (3, "Bob"))
  def lookup(k: Int): String = {
    var i = 0
    var arr = data.toArray
    var r = ""
    while i < arr.length do {
      if arr(i)._1 == k then r = arr(i)._2
      i = i + 1
    }
    r
  }
}