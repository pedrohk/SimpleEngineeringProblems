import org.scalatest.funsuite.AnyFunSuite

class GroupByTest extends AnyFunSuite {
  val nums = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val strs = List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j")

  val expectedNums = List(
    List(1, 2, 3),
    List(4, 5, 6),
    List(7, 8, 9),
    List(10)
  )

  val expectedStrs = List(
    List("a", "b", "c"),
    List("d", "e", "f"),
    List("g", "h", "i"),
    List("j")
  )

  val implementations = List(
    DPK01_impl_01.groupByN[Int],
    DPK01_impl_02.groupByN[Int],
    DPK01_impl_03.groupByN[Int],
    DPK01_impl_04.groupByN[Int],
    DPK01_impl_05.groupByN[Int],
    DPK01_impl_06.groupByN[Int]
  )

  test("All implementations group integers correctly") {
    implementations.foreach { f =>
      assert(f(nums, 3) == expectedNums)
    }
  }

  test("All implementations group strings correctly") {
    val stringImpls = List(
      DPK01_impl_01.groupByN[String],
      DPK01_impl_02.groupByN[String],
      DPK01_impl_03.groupByN[String],
      DPK01_impl_04.groupByN[String],
      DPK01_impl_05.groupByN[String],
      DPK01_impl_06.groupByN[String]
    )

    stringImpls.foreach { f =>
      assert(f(strs, 3) == expectedStrs)
    }
  }
}
