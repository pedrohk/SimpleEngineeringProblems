object DPK12_impl_03 {

  def bubble_sort(arr: Array[Int]): Array[Int] = {

    val res = new Array[Int](arr.length)

    var i = 0
    while (i < arr.length) {
      res(i) = arr(i)
      i = i + 1
    }

    var end = res.length - 1

    while (end > 0) {

      var j = 0

      while (j < end) {

        if (res(j) > res(j + 1)) {

          val temp = res(j)
          res(j) = res(j + 1)
          res(j + 1) = temp
        }

        j = j + 1
      }

      end = end - 1
    }

    res
  }
}
