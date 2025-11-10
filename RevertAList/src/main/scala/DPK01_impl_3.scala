object DPK01_impl_3 {
  def revert(list: List[Int]): List[Int] = {
    val arr = list.toArray
    var i = arr.length - 1
    var res: List[Int] = Nil
    while i >= 0 do {
      res =  res
      i -= 1
    }
    res
  }
}
