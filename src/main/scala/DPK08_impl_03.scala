object DPK08_impl_03 {
  def mapList[A, B](list: List[A], f: A => B): List[B] = {
    if (list.isEmpty) Nil
    else f(list.head) :: mapList(list.tail, f)
  }
}
