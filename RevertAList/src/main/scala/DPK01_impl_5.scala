object DPK01_impl_5 {
  def revert(list: List[Int]): List[Int] = {
    if list.isEmpty then Nil
    else revert(list.tail) ::: List(list.head)
  }
}
