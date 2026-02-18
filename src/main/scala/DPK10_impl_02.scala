object DPK10_impl_02 {

  def reduce[A, B](arr: Array[A], f: (B, A) => B, init: B): B = {
    var acc = init
    var i = arr.length - 1
    while (i >= 0) {
      acc = f(acc, arr(i))
      i = i - 1
    }
    acc
  }
}
