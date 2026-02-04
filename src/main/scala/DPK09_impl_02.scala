import scala.reflect.ClassTag

object DPK09_impl_02 {
  
  def filter[A: ClassTag](arr: Array[A], f: A => Boolean): Array[A] = {
    val temp = new Array[Any](arr.length)
    var size = 0
    var i = 0
    while (i < arr.length) {
      if (f(arr(i))) {
        temp(size) = arr(i)
        size = size + 1
      }
      i = i + 1
    }
    
    val result = new Array[A](size)
    
    i = 0
    while (i < size) {
      result(i) = temp(i).asInstanceOf[A]
      i = i + 1
    }
    result
  }
}
