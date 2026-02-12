import scala.reflect.ClassTag

object DPK09_impl_08 {

  def filter[A: ClassTag](arr: Array[A], f: A => Boolean): Array[A] = {
    var i = 0
    var size = 0
    while (i < arr.length) {
      if (f(arr(i))) {
        size = size + 1
      }
      i = i + 1
    }
    val result = new Array[A](size)
    i = 0
    var j = 0
    while (i < arr.length) {
      val x = arr(i)
      if (f(x)) {
        result(j) = x
        j = j + 1
      }
      i = i + 1
    }
    result
  }
}
