object DPK10_impl_04 {

  def reduce[A, B](arr: Array[A], f: (B, A) => B, init: B): B = {
    var acc = init
    var i = 0
    var done = false
    while (!done) {
      if (i == arr.length) {
        done = true
      } else {
        acc = f(acc, arr(i))
        i = i + 1
      }
    }
    acc
  }

}
