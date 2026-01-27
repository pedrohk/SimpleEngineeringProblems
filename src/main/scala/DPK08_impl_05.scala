import scala.reflect.ClassTag

object DPK08_impl_05 {

  def mapList[A, B](list: List[A], f: A => B): List[B] = {
    var result: List[B] = Nil
    var xs = list.reverse
    while (xs.nonEmpty) {
      result = f(xs.head) :: result
      xs = xs.tail
    }
    result
  }
  
  def mapListV2[A, B: ClassTag](list: List[A], f: A => B): List[B] = {
    def size(xs: List[A], n: Int): Int = {
      if (xs == Nil) n else size(xs.tail, n + 1)
    }

    def fill(xs: List[A], res: Array[B], i: Int): Unit = {
      if (xs != Nil) {
        res(i) = f(xs.head)
        fill(xs.tail, res, i + 1)
      }
    }

    val len = size(list, 0)
    val arr = new Array[B](len)
    fill(list, arr, 0)
    var i = len - 1
    var result: List[B] = Nil
    while (i >= 0) {
      result = arr(i) :: result
      i -= 1
    }
    result
  }
}
