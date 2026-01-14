object DPK07_impl_03 {
  
  def groupByN[T](input: List[T], size: Int): List[List[T]] = {
    var result: List[List[T]] = Nil
    var index = 0

    while (index < input.length) {
      var group: List[T] = Nil
      var i = 0
      while (i < size && index + i < input.length) {
        group = group :+ input(index + i)
        i += 1
      }
      result = result :+ group
      index += size
    }

    result
  }
}
