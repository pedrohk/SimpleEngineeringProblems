object DPK12_impl_01 {

  def bubble_sort(arr: Array[Int]): Array[Int] = {
    val result = new Array[Int](arr.length)

    var i = 0
    while (i < arr.length) {
      result(i) = arr(i)
      i = i + 1
    }

    var n = result.length
    var swapped = true

    while (swapped) {
      swapped = false
      var j = 0

      while (j < n - 1) {
        if (result(j) > result(j + 1)) {
          val temp = result(j)
          result(j) = result(j + 1)
          result(j + 1) = temp
          swapped = true
        }
        j = j + 1
      }

      n = n - 1
    }

    result
  }
}
