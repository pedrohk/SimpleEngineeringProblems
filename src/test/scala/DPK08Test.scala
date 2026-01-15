import org.scalatest.funsuite.AnyFunSuite

class DPK08Test extends AnyFunSuite {


  test("should double each element in the list") {
    val input = List(1, 2, 3, 4, 5)
    val expected = List(2, 4, 6, 8, 10)

    assert(DPK08_impl_01.mapList(input, _ * 2) == expected)
    assert(DPK08_impl_02.mapList(input, _ * 2) == expected)


  }

}
