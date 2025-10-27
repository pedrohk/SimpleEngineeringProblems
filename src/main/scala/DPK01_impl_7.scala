object DPK01_impl_7 {
  def revert(s: String): String =
    var result = ""
    for i <- 0 until s.length do
      result = s.charAt(i) + result
    result
}
