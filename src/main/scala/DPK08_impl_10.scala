object DPK08_impl_10 {
  
  def mapList[A, B](list: List[A], f: A => B): List[B] = {
    list.foldRight(List.empty[B]) { (x, acc) => f(x) :: acc }
  }
}
