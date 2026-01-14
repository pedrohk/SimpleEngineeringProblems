object DPK01_impl_9 {
  def revert(s: String): String =
    if s.length <= 1 then s
    else
      val mid = s.length / 2
      val left = s.substring(0, mid)
      val right = s.substring(mid)
      revert(right) + revert(left)
}
