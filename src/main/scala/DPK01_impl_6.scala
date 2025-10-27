object DPK01_impl_6 {
  def revert(s: String): String =
    s.indices.map(i => s(s.length - 1 - i)).mkString
}
