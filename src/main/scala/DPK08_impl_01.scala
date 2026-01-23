object DPK08_impl_01 {

  def mapList[A, B](list: List[A], f: A => B): List[B] = {
    def loop(xs: List[A], acc: List[B]): List[B] = {
      if (xs.isEmpty) acc.reverse
      else loop(xs.tail, f(xs.head) :: acc)
    }

    loop(list, Nil)
  }

  def mapListV2[A, B](list: List[A], f: A => B): List[B] = {

    def loop(xs: List[A], acc: List[B]): List[B] = {
      if (xs == Nil) acc
      else loop(xs.tail, f(xs.head) :: acc)
    }

    def reverse(xs: List[B], acc: List[B]): List[B] = {
      if (xs == Nil) acc
      else reverse(xs.tail, xs.head :: acc)
    }

    reverse(loop(list, Nil), Nil)
  }
}
