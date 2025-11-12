object DPK01_impl_8 {
  def revert(list: List[Int]): List[Int] = {
    val n = list.length
    val arr = new Array[Int](n)
    var i = 0
    var cur = list
    while (cur.nonEmpty) {
      arr(i) = cur.head
      i += 1
      cur = cur.tail
    }
    var j = 0
    var res: List[Int] = Nil
    while (j < n) {
      res = arr(j) :: res
      j += 1
    }
    res
  }
}

