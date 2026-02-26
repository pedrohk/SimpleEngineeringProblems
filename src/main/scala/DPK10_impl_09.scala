object DPK10_impl_09 {
  
  def reduce[A, B](arr: Array[A], f: (B, A) => B, init: B): B = {
    def loop(i: Int): B = {
      if (i == arr.length) {
        init
      } else {
        f(loop(i + 1), arr(i))
      }
    }

    loop(0)
  }
}
