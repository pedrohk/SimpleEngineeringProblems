object DPK08_impl_05 {

  def mapList[A, B](list: List[A], f: A => B): List[B] = {
    var result: List[B] = Nil
    var xs = list.reverse
    while (xs.nonEmpty) {
      result = f(xs.head) :: result
      xs = xs.tail
    }
    result
  }
}
