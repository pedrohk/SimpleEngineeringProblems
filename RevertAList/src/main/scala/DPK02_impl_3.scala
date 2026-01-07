object DPK02_impl_3 {
  def revert(list: List[Int]): List[Int] = {
    var res: List[Int] = Nil
    var i = 0
    val arr = list.toArray
    while (i < arr.length) {
      res = arr(i) :: res
      i += 1
    }
    res
  }
}
