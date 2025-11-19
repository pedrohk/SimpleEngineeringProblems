object DPK01_impl_6 {
  val data = List((1, "John"), (2, "Alice"), (3, "Bob"))
  def lookup(k: Int): String = {
    var idx = 0
    var arr = data.toArray
    var r = ""
    var done = false
    while idx < arr.length do {
      if arr(idx)._1 == k then {
        r = arr(idx)._2
        done = true
      }
      idx = idx + 1
    }
    r
  }
}
