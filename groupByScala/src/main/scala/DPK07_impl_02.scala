object DPK07_impl_02 {

  def groupByN[T](input: List[T], size: Int): List[List[T]] = {
    if (input.isEmpty) {
      Nil
    } else {
      val head = take(input, size)
      val tail = drop(input, size)
      head :: groupByN(tail, size)
    }
  }

  private def take[T](list: List[T], n: Int): List[T] = {
    if (list.isEmpty || n == 0) Nil
    else list.head :: take(list.tail, n - 1)
  }

  private def drop[T](list: List[T], n: Int): List[T] = {
    if (list.isEmpty || n == 0) list
    else drop(list.tail, n - 1)
  }
}
