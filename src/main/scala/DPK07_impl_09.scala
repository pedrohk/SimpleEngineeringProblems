object DPK07_impl_09 {
  
  def groupByN[T](input: List[T], size: Int): List[List[T]] = {
    def walk(pos: Int): List[List[T]] = {
      if (pos >= input.length) Nil
      else {
        var g = List[T]()
        var i = 0
        while (i < size && pos + i < input.length) {
          g = g :+ input(pos + i)
          i += 1
        }
        g :: walk(pos + size)
      }
    }
    walk(0)
  }
}
