object DPK10_impl_05 {

  def reduce[A, B](arr: Array[A], f: (B, A) => B, init: B): B = {
    var acc = init
    var i = 0
    if (arr.length == 0) {
      acc
    } else {
      while (i < arr.length) {
        acc = f(acc, arr(i))
        i = i + 1
      }
      acc
    }
  }
}