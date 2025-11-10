import org.scalatest.funsuite.AnyFunSuite

class RevertListTest extends AnyFunSuite {
  val input = List(1,2,3,4,5)
  val expected = List(5,4,3,2,1)

  test("revert1") {
    assert(DPK01_impl_1.revert(input) == expected)
  }

  test("revert2") {
    assert(DPK01_impl_2.revert(input) == expected)
  }

  test("revert3") {
    assert(DPK01_impl_3.revert(input) == expected)
  }

}
