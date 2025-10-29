import org.scalatest.funsuite.AnyFunSuite

class RevertTest extends AnyFunSuite:
  test("revert should reverse 'Hello' 01") {
    assert(DPK01_impl_1.revert("Hello") == "olleH")
  }

  test("revert should reverse empty string 01") {
    assert(DPK01_impl_1.revert("") == "")
  }

  test("revert should reverse single character 01") {
    assert(DPK01_impl_1.revert("A") == "A")
  }

  test("revert should reverse palindrome 01") {
    assert(DPK01_impl_1.revert("madam") == "madam")
  }

  test("revert should reverse string with spaces 01") {
    assert(DPK01_impl_1.revert("Hello World") == "dlroW olleH")
  }

  test("revert should reverse 'Hello' 02") {
    assert(DPK01_impl_2.revert("Hello") == "olleH")
  }

  test("revert should reverse empty string 02") {
    assert(DPK01_impl_2.revert("") == "")
  }

  test("revert should reverse single character 02") {
    assert(DPK01_impl_2.revert("A") == "A")
  }

  test("revert should reverse palindrome 02") {
    assert(DPK01_impl_2.revert("madam") == "madam")
  }

  test("revert should reverse string with spaces 02") {
    assert(DPK01_impl_2.revert("Hello World") == "dlroW olleH")
  }

  test("revert should reverse 'Hello' 03") {
    assert(DPK01_impl_3.revert("Hello") == "olleH")
  }

  test("revert should reverse empty string 03") {
    assert(DPK01_impl_3.revert("") == "")
  }

  test("revert should reverse single character 03") {
    assert(DPK01_impl_3.revert("A") == "A")
  }

  test("revert should reverse palindrome 03") {
    assert(DPK01_impl_3.revert("madam") == "madam")
  }

  test("revert should reverse string with spaces 03") {
    assert(DPK01_impl_3.revert("Hello World") == "dlroW olleH")
  }

  test("revert should reverse 'Hello' 04") {
    assert(DPK01_impl_4.revert("Hello") == "olleH")
  }

  test("revert should reverse empty string 04") {
    assert(DPK01_impl_4.revert("") == "")
  }

  test("revert should reverse single character 04") {
    assert(DPK01_impl_4.revert("A") == "A")
  }

  test("revert should reverse palindrome 04") {
    assert(DPK01_impl_4.revert("madam") == "madam")
  }

  test("revert should reverse string with spaces 04") {
    assert(DPK01_impl_4.revert("Hello World") == "dlroW olleH")
  }

  test("revert should reverse 'Hello' 05") {
    assert(DPK01_impl_5.revert("Hello") == "olleH")
  }

  test("revert should reverse empty string 05") {
    assert(DPK01_impl_5.revert("") == "")
  }

  test("revert should reverse single character 05") {
    assert(DPK01_impl_5.revert("Agua") == "augA")
  }

  test("revert should reverse palindrome 05") {
    assert(DPK01_impl_5.revert("madam") == "madam")
  }

  test("revert should reverse string with spaces 05") {
    assert(DPK01_impl_5.revert("Hello World") == "dlroW olleH")
  }

  test("revert should reverse 'Hello' 06") {
    assert(DPK01_impl_6.revert("Hello") == "olleH")
  }

  test("revert should reverse empty string 06") {
    assert(DPK01_impl_6.revert("") == "")
  }

  test("revert should reverse single character 06") {
    assert(DPK01_impl_6.revert("A") == "A")
  }

  test("revert should reverse palindrome 06") {
    assert(DPK01_impl_6.revert("madam") == "madam")
  }

  test("revert should reverse string with spaces 06") {
    assert(DPK01_impl_6.revert("Hello World") == "dlroW olleH")
  }

  test("revert should reverse 'Hello' 07") {
    assert(DPK01_impl_7.revert("Hello") == "olleH")
  }

  test("revert should reverse empty string 07") {
    assert(DPK01_impl_7.revert("") == "")
  }

  test("revert should reverse single character 07") {
    assert(DPK01_impl_7.revert("A") == "A")
  }

  test("revert should reverse palindrome 07") {
    assert(DPK01_impl_7.revert("madam") == "madam")
  }

  test("revert should reverse string with spaces 07") {
    assert(DPK01_impl_7.revert("Hello World") == "dlroW olleH")
  }

  test("revert should reverse 'Hello' 08") {
    assert(DPK01_impl_8.revert("Hello") == "olleH")
  }

  test("revert should reverse empty string 08") {
    assert(DPK01_impl_8.revert("") == "")
  }

  test("revert should reverse single character 08") {
    assert(DPK01_impl_8.revert("A") == "A")
  }

  test("revert should reverse palindrome 08") {
    assert(DPK01_impl_8.revert("madam") == "madam")
  }

  test("revert should reverse string with spaces 08") {
    assert(DPK01_impl_8.revert("Hello World") == "dlroW olleH")
  }

  test("revert should reverse 'Hello' 09") {
    assert(DPK01_impl_9.revert("Hello") == "olleH")
  }

  test("revert should reverse empty string 09") {
    assert(DPK01_impl_9.revert("") == "")
  }

  test("revert should reverse single character 09") {
    assert(DPK01_impl_9.revert("A") == "A")
  }

  test("revert should reverse palindrome 09") {
    assert(DPK01_impl_9.revert("madam") == "madam")
  }

  test("revert should reverse string with spaces 09") {
    assert(DPK01_impl_9.revert("Hello World") == "dlroW olleH")
  }

  test("revert should reverse 'Hello' 10") {
    assert(DPK01_impl_10.revert("Hello") == "olleH")
  }

  test("revert should reverse empty string 10") {
    assert(DPK01_impl_10.revert("") == "")
  }

  test("revert should reverse single character 10") {
    assert(DPK01_impl_10.revert("A") == "A")
  }

  test("revert should reverse palindrome 10") {
    assert(DPK01_impl_10.revert("madam") == "madam")
  }

  test("revert should reverse string with spaces 10") {
    assert(DPK01_impl_10.revert("Hello World") == "dlroW olleH")
  }
