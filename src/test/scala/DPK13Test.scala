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

}