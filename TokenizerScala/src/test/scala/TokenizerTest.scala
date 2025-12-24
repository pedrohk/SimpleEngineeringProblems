import org.scalatest.funsuite.AnyFunSuite

class TokenizerTest extends AnyFunSuite {

  val input1 = "Hello,World,How,Are,You"
  val input2 = "Hello World How Are You"
  val input3 = "Hello-World-How-Are-You"
  val expected = List("Hello", "World", "How", "Are", "You")

  test("tokenize1") {
    assert(DPK01_impl_1.tokenize(input1, ",") == expected)
  }

  test("tokenize2") {
    assert(DPK01_impl_2.tokenize(input2, " ") == expected)
  }

  test("tokenize3") {
    assert(DPK01_impl_3.tokenize(input2, " ").toList == expected)
  }

  test("tokenize4") {
    assert(DPK01_impl_4.tokenize(input2, " ").toList == expected)
  }

  test("tokenize5") {
    assert(DPK01_impl_5.tokenize(input2, " ") == expected)
  }

  test("tokenize6") {
    assert(DPK01_impl_6.tokenize(input2, " ") == expected)
  }

  test("tokenize7") {
    assert(DPK01_impl_7.tokenize(input2, " ") == expected)
  }

}
