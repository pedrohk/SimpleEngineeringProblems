object DPK06_impl_8 {

  def tokenize(s: String, t: String): List[String] = {
    def read(i: Int): (String, Int) = {
      var buf = ""
      var j = i
      while (j < s.length && s.charAt(j) != t.charAt(0)) {
        buf = buf + s.charAt(j)
        j = j + 1
      }
      (buf, j + 1)
    }

    var i = 0
    var res: List[String] = Nil
    while (i <= s.length) {
      val r = read(i)
      res = res :+ r._1
      i = r._2
      if (i > s.length) {
        i = s.length + 1
      }
    }
    res
  }
}
