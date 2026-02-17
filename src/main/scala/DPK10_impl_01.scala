object DPK10_impl_01 {

  def reduce[A, B](arr: Array[A], f: (B, A) => B, init: B): B = {
    var acc = init
    var i = 0
    while (i < arr.length) {
      acc = f(acc, arr(i))
      i = i + 1
    }
    acc
  }
}
