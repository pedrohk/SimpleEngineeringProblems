object DPK01_impl_2 {
  def revert(s: String): String =
    if s.isEmpty then ""
    else revert(s.tail) + s.head
}
