object DPK01_impl_1 {
  def revert(s: String): String = {
    var wordReturn: String = ""
    for i <- (0 until s.length).reverse do
      wordReturn += s(i)
    wordReturn
  }
}
