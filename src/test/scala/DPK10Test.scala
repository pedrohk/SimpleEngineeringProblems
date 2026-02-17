import org.scalatest.funsuite.AnyFunSuite

class DPK10Test extends AnyFunSuite {
  
  val data = Array(1, 2, 3, 4, 5)
  val f = (a: Int, b: Int) => a + b

  test("DPK10_impl_01") {
    assert(DPK10_impl_01.reduce(data, f, 0) == 15)
  }
}