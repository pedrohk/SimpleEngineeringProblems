import org.scalatest.funsuite.AnyFunSuite

class LookupTests extends AnyFunSuite {

  test("lookup implementations return John for key 1") {
    assert(DPK01_impl_1.lookup(1) == "John")
  }
}
