object DPK02_impl_9 {
  def revert(list: List[Int]): List[Int] = {

    @annotation.tailrec
    def inner(src: List[Int], acc: List[Int]): List[Int] = src match {
      case Nil => acc
      case head :: tail => inner(tail, head :: acc)
    }

    inner(list, Nil)
  }
}
