object DPK01_impl_10 {

  def tokenize(s: String, t: String): List[String] = {
    var res = List[String]()
    var i = s.length - 1
    var buf = ""
    while (i >= 0) {
      if (s.charAt(i) == t.charAt(0)) {
        res = buf :: res
        buf = ""
      } else {
        buf = s.charAt(i) + buf
      }
      i = i - 1
    }
    buf :: res
  }
}
