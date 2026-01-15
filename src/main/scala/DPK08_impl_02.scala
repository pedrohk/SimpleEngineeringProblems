object DPK08_impl_02 {
  def mapList[A, B](list: List[A], f: A => B): List[B] = {
    list.foldLeft(List.empty[B]) { (acc, x) => acc :+ f(x) }
  }
}
