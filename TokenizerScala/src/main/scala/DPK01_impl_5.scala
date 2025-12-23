object DPK01_impl_5 {

  def tokenize(s: String, t: String): List[String] = {
    var res: List[String] = Nil
    var buf = new StringBuilder
    var i = 0
    while (i < s.length) {
      if (s.charAt(i) == t.charAt(0)) {
        res = buf.toString :: res
        buf = new StringBuilder
      } else {
        buf.append(s.charAt(i))
      }
      i = i + 1
    }
    (buf.toString :: res).reverse
  }
}
