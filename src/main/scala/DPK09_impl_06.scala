import scala.reflect.ClassTag

object DPK09_impl_06 {
  
  def filter[A: ClassTag](arr: Array[A], f: A => Boolean): Array[A] = {
    val flags = new Array[Int](arr.length)
    var i = 0
    var total = 0
    while (i < arr.length) {
      if (f(arr(i))) {
        flags(i) = 1
        total = total + 1
      }
      i = i + 1
    }
    val result = new Array[A](total)
    i = 0
    var pos = 0
    while (i < arr.length) {
      if (flags(i) == 1) {
        result(pos) = arr(i)
        pos = pos + 1
      }
      i = i + 1
    }
    result
  }
}
