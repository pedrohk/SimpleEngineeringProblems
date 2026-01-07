object DPK02_impl_7 {
  def revert(list: List[Int]): List[Int] = {
    def append(a: List[Int], b: List[Int]): List[Int] = {
      if a.isEmpty then b
      else a.head :: append(a.tail, b)
    }

    def rev(a: List[Int]): List[Int] = {
      if a.isEmpty then Nil
      else append(rev(a.tail), List(a.head))
    }

    rev(list)
  }
}
