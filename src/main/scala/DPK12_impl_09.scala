object DPK12_impl_09 {

  def bubble_sort(arr: Array[Int]): Array[Int] = {

    val a = new Array[Int](arr.length)

    var i = 0
    while (i < arr.length) {
      a(i) = arr(i)
      i = i + 1
    }

    var changed = true

    while (changed) {

      changed = false

      var j = 0

      while (j < a.length - 1) {

        if (a(j) > a(j + 1)) {

          val t = a(j)
          a(j) = a(j + 1)
          a(j + 1) = t

          changed = true
        }

        j = j + 1
      }
    }

    a
  }
}
