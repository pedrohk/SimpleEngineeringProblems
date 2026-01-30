object DPK08_impl_09 {
  
  def mapList[A, B](list: List[A], f: A => B): List[B] = {
    var acc = List.empty[B]
    for (x <- list) {
      acc = acc :+ f(x)
    }
    acc
  }

  def mapListV2[A, B](list: List[A], f: A => B): List[B] = {
    if (list == Nil) Nil
    else {
      val head = f(list.head)
      val tail = mapList(list.tail, f)
      head :: tail
    }
  }
}
