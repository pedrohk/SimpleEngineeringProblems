object DPK01_impl_04 {

  def groupByN[T](input: List[T], size: Int): List[List[T]] = {
    loop(input, size, Nil, Nil)
  }

  private def loop[T](
                       remaining: List[T],
                       size: Int,
                       current: List[T],
                       acc: List[List[T]]
                     ): List[List[T]] = {
    if (remaining.isEmpty) {
      if (current.nonEmpty) acc :+ current else acc
    } else if (current.length == size) {
      loop(remaining, size, Nil, acc :+ current)
    } else {
      loop(remaining.tail, size, current :+ remaining.head, acc)
    }
  }
}
