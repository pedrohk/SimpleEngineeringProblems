import scala.reflect.ClassTag

object DPK09_impl_10 {
  
  def filter[A: ClassTag](arr: Array[A], f: A => Boolean): Array[A] = {
    val buf = new Array[Any](arr.length)
    var i = 0
    var k = 0
    while (i < arr.length) {
      val e = arr(i)
      if (f(e)) {
        buf(k) = e
        k = k + 1
      }
      i = i + 1
    }
    val result = new Array[A](k)
    i = 0
    while (i < k) {
      result(i) = buf(i).asInstanceOf[A]
      i = i + 1
    }
    result
  }
}
