object DPK12_impl_08 {

  def bubble_sort(arr: Array[Int]): Array[Int] = {

    val r = new Array[Int](arr.length)

    var i = 0
    while (i < arr.length) {
      r(i) = arr(i)
      i = i + 1
    }

    var end = r.length

    while (end > 0) {

      var j = 1

      while (j < end) {

        if (r(j - 1) > r(j)) {

          val t = r(j)
          r(j) = r(j - 1)
          r(j - 1) = t
        }

        j = j + 1
      }

      end = end - 1
    }

    r
  }
}
