import org.scalatest.funsuite.AnyFunSuite

class DPK13Test extends AnyFunSuite {

  val expected10 = Array[Any](
    1,2,"Fizz",4,"Buzz","Fizz",7,8,"Fizz","Buzz"
  )

  test("DPK13_impl_01") {
    assert(DPK13_impl_01.fizzbuzz(10).sameElements(expected10))
  }

  test("DPK13_impl_02") {
    assert(DPK13_impl_02.fizzbuzz(10).sameElements(expected10))
  }

  test("DPK13_impl_03") {
    assert(DPK13_impl_03.fizzbuzz(10).sameElements(expected10))
  }

  test("DPK13_impl_04") {
    assert(DPK13_impl_04.fizzbuzz(10).sameElements(expected10))
  }

  test("DPK13_impl_05") {
    assert(DPK13_impl_05.fizzbuzz(10).sameElements(expected10))
  }

  test("DPK13_impl_06") {
    assert(DPK13_impl_06.fizzbuzz(10).sameElements(expected10))
  }

  test("DPK13_impl_07") {
    assert(DPK13_impl_07.fizzbuzz(10).sameElements(expected10))
  }

  test("DPK13_impl_08") {
    assert(DPK13_impl_08.fizzbuzz(10).sameElements(expected10))
  }

  test("DPK13_impl_09") {
    assert(DPK13_impl_09.fizzbuzz(10).sameElements(expected10))
  }

  test("DPK13_impl_10") {
    assert(DPK13_impl_10.fizzbuzz(10).sameElements(expected10))
  }

}