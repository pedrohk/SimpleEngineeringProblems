object DPK01_impl_4 {

  def tokenize(s: String, t: String): Array[String] = {
    var count = 1
    for (i <- 0 until s.length) {
      if (s.charAt(i) == t.charAt(0)) {
        count = count + 1
      }
    }
    val arr = new Array[String](count)
    var idx = 0
    var buf = ""
    for (i <- 0 until s.length) {
      if (s.charAt(i) == t.charAt(0)) {
        arr(idx) = buf
        idx = idx + 1
        buf = ""
      } else {
        buf = buf + s.charAt(i)
      }
    }
    arr(idx) = buf
    arr
  }
}
