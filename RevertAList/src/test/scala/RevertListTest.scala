import org.scalatest.funsuite.AnyFunSuite

class RevertListTest extends AnyFunSuite {
  val input = List(1,2,3,4,5)
  val expected = List(5,4,3,2,1)

  test("DPK01_impl_1") {
    assert(DPK01_impl_1.revert(input) == expected)
  }

  test("DPK01_impl_2") {
    assert(DPK01_impl_2.revert(input) == expected)
  }

  test("DPK01_impl_3") {
    assert(DPK01_impl_3.revert(input) == expected)
  }

  test("DPK01_impl_4") {
    assert(DPK01_impl_4.revert(input) == expected)
  }

  test("DPK01_impl_5") {
    assert(DPK01_impl_5.revert(input) == expected)
  }

  test("DPK01_impl_6") {
    assert(DPK01_impl_6.revert(input) == expected)
  }

  test("DPK01_impl_7") {
    assert(DPK01_impl_7.revert(input) == expected)
  }

  test("DPK01_impl_8") {
    assert(DPK01_impl_8.revert(input) == expected)
  }


}
