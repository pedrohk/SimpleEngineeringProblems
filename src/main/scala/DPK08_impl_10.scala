object DPK08_impl_10 {
  
  def mapList[A, B](list: List[A], f: A => B): List[B] = {
    list.foldRight(List.empty[B]) { (x, acc) => f(x) :: acc }
  }

  def mapListV2[A, B](list: List[A], f: A => B): List[B] = {
    def go(xs: List[A], acc: List[B]): List[B] = {
      if (xs == Nil) acc
      else go(xs.tail, f(xs.head) :: acc)
    }

    def rev(xs: List[B], acc: List[B]): List[B] = {
      if (xs == Nil) acc
      else rev(xs.tail, xs.head :: acc)
    }

    rev(go(list, Nil), Nil)
  }
}
