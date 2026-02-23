object DPK10_impl_06 {
  
  def reduce[A, B](arr: Array[A], f: (B, A) => B, init: B): B = {
    def loop(i: Int, acc: B): B = {
      if (i < 0) {
        acc
      } else {
        loop(i - 1, f(acc, arr(i)))
      }
    }

    loop(arr.length - 1, init)
  }
}
