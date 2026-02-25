object DPK10_impl_08 {

  def reduce[A, B](arr: Array[A], f: (B, A) => B, init: B): B = {
    var acc = init
    var i = 0
    while (true) {
      if (i >= arr.length) {
        return acc
      }
      acc = f(acc, arr(i))
      i = i + 1
    }
    acc
  }
}
