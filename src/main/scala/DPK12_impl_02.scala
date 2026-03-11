object DPK12_impl_02 {

  def bubble_sort(arr: Array[Int]): Array[Int] = {

    val a = new Array[Int](arr.length)

    var i = 0
    while (i < arr.length) {
      a(i) = arr(i)
      i = i + 1
    }

    var pass = 0

    while (pass < a.length) {

      var j = 0

      while (j < a.length - 1) {

        if (a(j) > a(j + 1)) {

          val t = a(j)
          a(j) = a(j + 1)
          a(j + 1) = t
        }

        j = j + 1
      }

      pass = pass + 1
    }

    a
  }
}
