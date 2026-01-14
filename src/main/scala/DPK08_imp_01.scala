object DPK08_imp_01 {

  def mapList[A, B](list: List[A], f: A => B): List[B] = {
    def loop(xs: List[A], acc: List[B]): List[B] = {
      if (xs.isEmpty) acc.reverse
      else loop(xs.tail, f(xs.head) :: acc)
    }

    loop(list, Nil)
  }
}
