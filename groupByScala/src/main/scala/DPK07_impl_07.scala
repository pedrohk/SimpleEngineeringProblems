object DPK07_impl_07 {

  def groupByN[T](input: List[T], size: Int): List[List[T]] = {
    var res = List[List[T]]()
    var idx = 0

    while (idx < input.size) {
      var g = List[T]()
      var j = 0
      while (j < size && idx + j < input.size) {
        g = g :+ input(idx + j)
        j += 1
      }
      res = res :+ g
      idx += size
    }

    res
  }
}
