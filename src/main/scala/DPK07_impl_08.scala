object DPK07_impl_08 {
  
  def groupByN[T](input: List[T], size: Int): List[List[T]] = {
    var acc = List[List[T]]()
    var current = List[T]()

    for (e <- input) {
      if (current.length == size) {
        acc = acc :+ current
        current = List(e)
      } else {
        current = current :+ e
      }
    }

    if (current.nonEmpty) acc = acc :+ current
    acc
  }
}
