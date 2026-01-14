object DPK06_impl_6 {
  
  def tokenize(s: String, t: String): List[String] = {
    var res: List[String] = Nil
    var start = 0
    var i = 0
    while (i <= s.length) {
      if (i == s.length || s.charAt(i) == t.charAt(0)) {
        var part = ""
        var j = start
        while (j < i) {
          part = part + s.charAt(j)
          j = j + 1
        }
        res = part :: res
        start = i + 1
      }
      i = i + 1
    }
    res.reverse
  }
}
