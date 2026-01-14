object DPK07_impl_10 {
  
  def groupByN[T](input: List[T], size: Int): List[List[T]] = {
    var out = List[List[T]]()
    var buf = List[T]()
    var c = 0

    input.foreach { e =>
      buf = buf :+ e
      c += 1
      if (c == size) {
        out = out :+ buf
        buf = Nil
        c = 0
      }
    }

    if (buf.nonEmpty) out = out :+ buf
    out
  }
}
