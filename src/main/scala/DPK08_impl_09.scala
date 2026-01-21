object DPK08_impl_09 {
  
  def mapList[A, B](list: List[A], f: A => B): List[B] = {
    var acc = List.empty[B]
    for (x <- list) {
      acc = acc :+ f(x)
    }
    acc
  }
}
