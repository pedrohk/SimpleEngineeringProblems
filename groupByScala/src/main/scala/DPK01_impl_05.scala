object DPK01_impl_05 {

  def groupByN[T](input: List[T], size: Int): List[List[T]] = {
    var result = List[List[T]]()
    var temp = List[T]()

    for (e <- input) {
      temp = temp :+ e
      if (temp.length == size) {
        result = result :+ temp
        temp = Nil
      }
    }

    if (temp.nonEmpty) result = result :+ temp
    result
  }
}
