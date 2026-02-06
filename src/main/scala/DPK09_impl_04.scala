import scala.reflect.ClassTag

object DPK09_impl_04 {
  
  def filter[A: ClassTag](arr: Array[A], f: A => Boolean): Array[A] = {
    val buffer = new Array[Any](arr.length)
    var i = 0
    var k = 0
    while (i < arr.length) {
      val v = arr(i)
      if (f(v)) {
        buffer(k) = v
        k = k + 1
      }
      i = i + 1
    }
    val result = new Array[A](k)
    i = 0
    while (i < k) {
      result(i) = buffer(i).asInstanceOf[A]
      i = i + 1
    }
    result
  }
}
