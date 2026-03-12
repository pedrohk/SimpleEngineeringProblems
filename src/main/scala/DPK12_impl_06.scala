object DPK12_impl_06 {

  def bubble_sort(arr: Array[Int]): Array[Int] = {

    val out = new Array[Int](arr.length)

    var i = 0
    while (i < arr.length) {
      out(i) = arr(i)
      i = i + 1
    }

    var limit = out.length

    while (limit > 1) {

      var j = 0

      while (j < limit - 1) {

        if (out(j) > out(j + 1)) {

          val temp = out(j)
          out(j) = out(j + 1)
          out(j + 1) = temp
        }

        j = j + 1
      }

      limit = limit - 1
    }

    out
  }
}
