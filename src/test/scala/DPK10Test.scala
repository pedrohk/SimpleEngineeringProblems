import org.scalatest.funsuite.AnyFunSuite

class DPK10Test extends AnyFunSuite {
  
  val data = Array(1, 2, 3, 4, 5)
  val f = (a: Int, b: Int) => a + b

  test("DPK10_impl_01") {
    assert(DPK10_impl_01.reduce(data, f, 0) == 15)
  }

  test("DPK10_impl_02") {
    assert(DPK10_impl_02.reduce(data, f, 0) == 15)
  }

  test("DPK10_impl_03") {
    assert(DPK10_impl_03.reduce(data, f, 0) == 15)
  }

  test("DPK10_impl_04") {
    assert(DPK10_impl_04.reduce(data, f, 0) == 15)
  }

  test("DPK10_impl_05") {
    assert(DPK10_impl_05.reduce(data, f, 0) == 15)
  }

  test("DPK10_impl_06") {
    assert(DPK10_impl_06.reduce(data, f, 0) == 15)
  }

  test("DPK10_impl_07") {
    assert(DPK10_impl_07.reduce(data, f, 0) == 15)
  }

  test("DPK10_impl_08") {
    assert(DPK10_impl_08.reduce(data, f, 0) == 15)
  }

  test("DPK10_impl_09") {
    assert(DPK10_impl_09.reduce(data, f, 0) == 15)
  }
}