object DPK10_impl_10 {
  
  def reduce[A, B](arr: Array[A], f: (B, A) => B, init: B): B = {
    var acc = init
    var i = 0
    while (i < arr.length) {
      val a = acc
      val b = arr(i)
      acc = f(a, b)
      i = i + 1
    }
    acc
  }
}
