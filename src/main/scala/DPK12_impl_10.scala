object DPK12_impl_10 {

  def bubble_sort(arr: Array[Int]): Array[Int] = {

    val r = new Array[Int](arr.length)

    var i = 0
    while (i < arr.length) {
      r(i) = arr(i)
      i = i + 1
    }

    var outer = r.length - 1

    while (outer > 0) {

      var inner = 0

      while (inner < outer) {

        if (r(inner) > r(inner + 1)) {

          val temp = r(inner)
          r(inner) = r(inner + 1)
          r(inner + 1) = temp
        }

        inner = inner + 1
      }

      outer = outer - 1
    }

    r
  }
}
