object DPK12_impl_04 {

  def bubble_sort(arr: Array[Int]): Array[Int] = {

    val a = new Array[Int](arr.length)

    var k = 0
    while (k < arr.length) {
      a(k) = arr(k)
      k = k + 1
    }

    var sorted = false

    while (!sorted) {

      sorted = true

      var i = 0

      while (i < a.length - 1) {

        if (a(i) > a(i + 1)) {

          val t = a(i)
          a(i) = a(i + 1)
          a(i + 1) = t

          sorted = false
        }

        i = i + 1
      }
    }

    a
  }
}
