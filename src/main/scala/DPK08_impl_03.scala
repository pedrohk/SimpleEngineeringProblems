object DPK08_impl_03 {
  def mapList[A, B](list: List[A], f: A => B): List[B] = {
    if (list.isEmpty) Nil
    else f(list.head) :: mapList(list.tail, f)
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
