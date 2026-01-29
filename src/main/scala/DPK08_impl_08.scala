object DPK08_impl_08 {

  def mapList[A, B](list: List[A], f: A => B): List[B] = {
    list.iterator.map(f).toList
  }

  def mapListV2[A, B](list: List[A], f: A => B): List[B] = {
    var xs = list
    var acc: List[B] = Nil
    while (xs != Nil) {
      acc = f(xs.head) :: acc
      xs = xs.tail
    }
    var res: List[B] = Nil
    var ys = acc
    while (ys != Nil) {
      res = ys.head :: res
      ys = ys.tail
    }
    res
  }
}
