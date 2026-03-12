object DPK12_impl_05 {

  def bubble_sort(arr: Array[Int]): Array[Int] = {

    val r = new Array[Int](arr.length)

    var i = 0
    while (i < arr.length) {
      r(i) = arr(i)
      i = i + 1
    }

    var p = 0

    while (p < r.length) {

      var j = 0

      while (j < r.length - p - 1) {

        if (r(j) > r(j + 1)) {

          val t = r(j)
          r(j) = r(j + 1)
          r(j + 1) = t
        }

        j = j + 1
      }

      p = p + 1
    }

    r
  }
}
