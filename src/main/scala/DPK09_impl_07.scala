import scala.reflect.ClassTag

object DPK09_impl_07 {
  
  def filter[A: ClassTag](arr: Array[A], f: A => Boolean): Array[A] = {
    val temp = new Array[A](arr.length)
    var i = 0
    var p = 0
    while (i < arr.length) {
      val v = arr(i)
      if (f(v)) {
        temp(p) = v
        p = p + 1
      }
      i = i + 1
    }
    val result = new Array[A](p)
    i = 0
    while (i < p) {
      result(i) = temp(i)
      i = i + 1
    }
    result
  }
}
