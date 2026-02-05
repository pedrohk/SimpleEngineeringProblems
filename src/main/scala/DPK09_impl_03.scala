import scala.reflect.ClassTag
object DPK09_impl_03 {
  
  def filter[A: ClassTag](arr: Array[A], f: A => Boolean): Array[A] = {
    var i = 0
    var mask = new Array[Boolean](arr.length)
    var count = 0
    while (i < arr.length) {
      if (f(arr(i))) {
        mask(i) = true
        count = count + 1
      }
      i = i + 1
    }
    val result = new Array[A](count)
    i = 0
    var j = 0
    while (i < arr.length) {
      if (mask(i)) {
        result(j) = arr(i)
        j = j + 1
      }
      i = i + 1
    }
    result
  }
}
