import scala.reflect.ClassTag

object DPK08_impl_06 {

  def mapArray[A, B: ClassTag](array: Array[A], f: A => B): Array[B] = {
    val result = new Array[B](array.length)
    var i = 0
    while (i < array.length) {
      result(i) = f(array(i))
      i += 1
    }
    result
  }
}

