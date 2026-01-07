object DPK03_impl_2 {
  val data = List((1, "John"), (2, "Alice"), (3, "Bob"))

  def lookup(k: Int): String = {
    var i = 0
    var arr = data.toArray
    var r = ""
    var found = false
    while i < arr.length && !found do {
      if arr(i)._1 == k then {
        r = arr(i)._2
        found = true
      }
      i = i + 1
    }
    r
  }
}
