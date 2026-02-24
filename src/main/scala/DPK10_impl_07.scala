object DPK10_impl_07 {

  def reduce[A, B](arr: Array[A], f: (B, A) => B, init: B): B = {
    var acc = init
    var i = 0
    var len = arr.length
    while (i < len) {
      acc = f(acc, arr(i))
      i = i + 1
    }
    acc
  }
}
