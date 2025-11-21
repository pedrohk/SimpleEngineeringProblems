import org.scalatest.funsuite.AnyFunSuite

class LookupScalaTests extends AnyFunSuite {

  test("lookup implementations return John for key 1") {
    assert(DPK01_impl_1.lookup(1) == "John")
    assert(DPK01_impl_2.lookup(1) == "John")
    assert(DPK01_impl_3.lookup(1) == "John")
    assert(DPK01_impl_4.lookup(1) == "John")
    assert(DPK01_impl_5.lookup(1) == "John")
    assert(DPK01_impl_6.lookup(1) == "John")
    assert(DPK01_impl_7.lookup(2) == "Alice")
    assert(DPK01_impl_8.lookup(3) == "Bob")
    assert(DPK01_impl_9.lookup(2) == "Alice")
    assert(DPK01_impl_10.lookup(3) == "Bob")
  }
}
