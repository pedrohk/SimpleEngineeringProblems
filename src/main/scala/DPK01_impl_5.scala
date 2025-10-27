object DPK01_impl_5 {
  def revert(s: String): String = {
    var word = s.tail
    for (elem <- s) {
        word += elem.toString
    }
    word
  }
}
