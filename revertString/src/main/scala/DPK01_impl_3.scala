object DPK01_impl_3 {
  def revert(s: String): String =
    val arr = new Array[Char](s.length)
    for i <- 0 until s.length do
      arr(i) = s.charAt(s.length - 1 - i)
    new String(arr)
}
