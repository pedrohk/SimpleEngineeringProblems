object DPK01_impl_01 {

  def groupByN[T](input: List[T], size: Int): List[List[T]] = {
    var result: List[List[T]] = Nil
    var current: List[T] = Nil
    var count = 0

    var remaining = input
    while (remaining.nonEmpty) {
      current = current :+ remaining.head
      count += 1

      if (count == size) {
        result = result :+ current
        current = Nil
        count = 0
      }
      remaining = remaining.tail
    }

    if (current.nonEmpty) {
      result = result :+ current
    }

    result
  }
}
