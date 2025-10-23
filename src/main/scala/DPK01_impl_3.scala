object DPK01_impl_3 {
  def revert(s: String): String =
    if s.isEmpty then ""
    else s.charAt(s.length) + revert(s.tail)
}
