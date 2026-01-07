object DPK06_impl_7 {
  
  def tokenize(s: String, t: String): List[String] = {
    var res = List[String]()
    var chars = new Array[Char](s.length)
    var len = 0
    for (i <- 0 until s.length) {
      if (s.charAt(i) == t.charAt(0)) {
        res = res :+ new String(chars, 0, len)
        len = 0
      } else {
        chars(len) = s.charAt(i)
        len = len + 1
      }
    }
    res :+ new String(chars, 0, len)
  }
}
