object DPK02_impl_6 {
  def revert(list: List[Int]): List[Int] = {
    val n = list.length

    def get(i: Int, l: List[Int]): Int = {
      if i == 0 then l.head
      else get(i - 1, l.tail)
    }

    def build(i: Int): List[Int] = {
      if i < 0 then Nil
      else get(i, list) :: build(i - 1)
    }

    build(n - 1)
  }
}
