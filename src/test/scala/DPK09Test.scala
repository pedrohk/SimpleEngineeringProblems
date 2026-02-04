import org.scalatest.funsuite.AnyFunSuite

class DPK09Test extends AnyFunSuite {
  val input = Array(1,2,3,4,5,6,7,8,9,10)
  val expected = Array(2,4,6,8,10)
  val f = (x: Int) => x % 2 == 0

  def same(a: Array[Int], b: Array[Int]): Boolean = {
    if (a.length != b.length) {
      false
    } else {
      var i = 0
      var ok = true
      while (i < a.length) {
        if (a(i) != b(i)) {
          ok = false
        }
        i = i + 1
      }
      ok
    }
  }

  test("DPK09_impl_01") { assert(same(DPK09_impl_01.filter(input,f), expected)) }
  test("DPK09_impl_02") { assert(same(DPK09_impl_02.filter(input,f), expected)) }

}
