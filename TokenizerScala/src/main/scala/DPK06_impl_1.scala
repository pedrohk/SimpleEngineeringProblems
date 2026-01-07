object DPK06_impl_1 {

  def tokenize(s: String, t: String): List[String] = {
    var i = 0
    var current = ""
    var result: List[String] = Nil
    while (i < s.length) {
      if (s.charAt(i) == t.charAt(0)) {
        result = current :: result
        current = ""
      } else {
        current = current + s.charAt(i)
      }
      i = i + 1
    }
    (current :: result).reverse
  }
}
