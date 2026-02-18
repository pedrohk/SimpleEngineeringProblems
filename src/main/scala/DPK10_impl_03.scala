object DPK10_impl_03 {
  
  def reduce[A, B](arr: Array[A], f: (B, A) => B, init: B): B = {
    def loop(i: Int, acc: B): B = {
      if (i == arr.length) {
        acc
      } else {
        loop(i + 1, f(acc, arr(i)))
      }
    }

    loop(0, init)
  }
}
