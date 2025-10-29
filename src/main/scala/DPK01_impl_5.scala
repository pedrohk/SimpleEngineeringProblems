object DPK01_impl_5 {
  def revert(s: String): String =
    val chars = s.toCharArray
    var left = 0
    var right = chars.length - 1
    while left < right do
      val temp = chars(left)
      chars(left) = chars(right)
      chars(right) = temp
      left += 1
      right -= 1
    new String(chars)
}
