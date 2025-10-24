object DPK01_impl_4 {
  def revert(s: String): String =
    @annotation.tailrec
    def loop(in: String, acc: String): String =
      if in.isEmpty then acc
      else loop(in.tail, in.head + acc)

    loop(s, "")

}
