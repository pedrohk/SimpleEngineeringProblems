object DPK01_impl_10 {
  def revert(list: List[Int]): List[Int] = {
    def loop(src: List[Int], acc: List[Int]): List[Int] = {
      if src == Nil then acc
      else loop(src.tail, src.head :: acc)
    }

    loop(list, Nil)
  }
}
