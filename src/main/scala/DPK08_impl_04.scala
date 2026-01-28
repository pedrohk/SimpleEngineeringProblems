object DPK08_impl_04 {
  
  def mapList[A, B](list: List[A], f: A => B): List[B] = {
    val buffer = scala.collection.mutable.ListBuffer.empty[B]
    var xs = list
    while (xs.nonEmpty) {
      buffer += f(xs.head)
      xs = xs.tail
    }
    buffer.toList
  } 
}
