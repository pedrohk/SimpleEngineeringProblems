import org.scalatest.funsuite.AnyFunSuite

class DPK12Test extends AnyFunSuite {

  val input = Array(5, 4, 3, 2, 1)
  val expected = Array(1, 2, 3, 4, 5)

  def arraysEqual(a: Array[Int], b: Array[Int]): Boolean = {

    if (a.length != b.length) return false

    var i = 0

    while (i < a.length) {

      if (a(i) != b(i)) {
        return false
      }

      i = i + 1
    }

    true
  }

  test("impl_01") {
    assert(arraysEqual(DPK12_impl_01.bubble_sort(input), expected))
  }

  test("impl_02") {
    assert(arraysEqual(DPK12_impl_02.bubble_sort(input), expected))
  }

  test("impl_03") {
    assert(arraysEqual(DPK12_impl_03.bubble_sort(input), expected))
  }

  test("impl_04") {
    assert(arraysEqual(DPK12_impl_04.bubble_sort(input), expected))
  }

  test("impl_05") {
    assert(arraysEqual(DPK12_impl_05.bubble_sort(input), expected))
  }

  test("impl_06") {
    assert(arraysEqual(DPK12_impl_06.bubble_sort(input), expected))
  }

  test("impl_07") {
    assert(arraysEqual(DPK12_impl_07.bubble_sort(input), expected))
  }

  test("impl_08") {
    assert(arraysEqual(DPK12_impl_08.bubble_sort(input), expected))
  }

  test("impl_09") {
    assert(arraysEqual(DPK12_impl_09.bubble_sort(input), expected))
  }

}
