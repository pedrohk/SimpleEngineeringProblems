object DPK07_impl_06 {

  def groupByN[T](input: List[T], size: Int): List[List[T]] = {
    var rest = input
    var result: List[List[T]] = Nil

    while (rest.nonEmpty) {
      var group: List[T] = Nil
      var i = 0
      while (i < size && rest.nonEmpty) {
        rest match {
          case h :: t =>
            group = group :+ h
            rest = t
          case Nil =>
        }
        i += 1
      }
      result = result :+ group
    }

    result
  }
}
