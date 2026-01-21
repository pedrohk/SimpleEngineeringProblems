object DPK08_impl_08 {

  def mapList[A, B](list: List[A], f: A => B): List[B] = {
    list.iterator.map(f).toList
  }
}
