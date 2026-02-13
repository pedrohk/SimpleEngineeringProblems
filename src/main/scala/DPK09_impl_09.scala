import scala.reflect.ClassTag

object DPK09_impl_09 {
  
  def filter[A: ClassTag](arr: Array[A], f: A => Boolean): Array[A] = {
    val keep = new Array[Boolean](arr.length)
    var i = 0
    var n = 0
    while (i < arr.length) {
      if (f(arr(i))) {
        keep(i) = true
        n = n + 1
      }
      i = i + 1
    }
    val result = new Array[A](n)
    i = 0
    var j = 0
    while (i < arr.length) {
      if (keep(i)) {
        result(j) = arr(i)
        j = j + 1
      }
      i = i + 1
    }
    result
  }
}
