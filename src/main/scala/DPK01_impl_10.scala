object DPK01_impl_10 {
  def revert(s: String): String =
    var result = new StringBuilder()
    var i = s.length - 1
    while i >= 0 do
      result.append(s.charAt(i))
      i -= 1
    result.toString
}
