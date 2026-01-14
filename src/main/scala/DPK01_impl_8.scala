object DPK01_impl_8 {
  def revert(s: String): String =
    val stack = new Array[Char](s.length)
    var top = -1
    for i <- 0 until s.length do
      top += 1
      stack(top) = s.charAt(i)
    var res = ""
    while top >= 0 do
      res += stack(top)
      top -= 1
    res
}
