object DPK08_impl_07 {

  def mapList[A, B](list: List[A], f: A => B): List[B] = {
    list match {
      case Nil => Nil
      case h :: t => f(h) :: mapList(t, f)
    }
  }

  def mapListV2[A, B](list: List[A], f: A => B): List[B] = {
    def loop(xs: List[A]): List[B] = {
      if (xs == Nil) Nil
      else f(xs.head) :: loop(xs.tail)
    }

    loop(list)
  }
}
