object DPK01_impl_4 {
  def revert(list: List[Int]): List[Int] = {
    def loop(a: List[Int], b: List[Int]): List[Int] = {
      if a.isEmpty then b
      else loop(a.tail, a.head :: b)
    }

    loop(list, Nil)
  }
}
