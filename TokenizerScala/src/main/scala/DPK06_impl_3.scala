object DPK06_impl_3 {

  def tokenize(s: String, t: String): Vector[String] = {
    var res = Vector[String]()
    var buf = ""
    for (i <- 0 until s.length) {
      if (s.charAt(i) == t.charAt(0)) {
        res = res :+ buf
        buf = ""
      } else {
        buf = buf + s.charAt(i)
      }
    }
    res :+ buf
  }
}
