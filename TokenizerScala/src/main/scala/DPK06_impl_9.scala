object DPK06_impl_9 {

  def tokenize(s: String, t: String): List[String] = {
    var acc: List[String] = Nil
    var buf = ""
    for (c <- s) {
      if (c == t.charAt(0)) {
        acc = acc :+ buf
        buf = ""
      } else {
        buf = buf + c
      }
    }
    acc :+ buf
  }
}
