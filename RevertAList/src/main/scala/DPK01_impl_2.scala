object DPK01_impl_2 {
  def revert(list: List[Int]): List[Int] = {
    var src = list
    var acc: List[Int] = Nil
    while src.nonEmpty do {
      acc = src.head :: acc
      src = src.tail
    }
    acc
  }
}
