import scala.reflect.ClassTag

object DPK09_impl_01 {

  def filter[A: ClassTag](arr: Array[A], f: A => Boolean): Array[A] = {
    var count = 0
    var i = 0
    while (i < arr.length) {
      if (f(arr(i))) {
        count = count + 1
      }
      i = i + 1
    }

    val result = new Array[A](count)

    i = 0
    var j = 0
    while (i < arr.length) {
      if (f(arr(i))) {
        result(j) = arr(i)
        j = j + 1
      }
      i = i + 1
    }

    result
  }
}