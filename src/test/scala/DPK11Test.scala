import org.scalatest.funsuite.AnyFunSuite

class DPK11Test extends AnyFunSuite {

  val input1 = "Hello,World,How,Are,You"
  val expected1 = "Hello-World-How-Are-You"

  val input2 = "Hello,World,How,Are,You"
  val expected2 = "Hello-How-Are-You"

  val implementations = List(
    DPK11_impl_01.replace _,
    DPK11_impl_02.replace _,
    DPK11_impl_03.replace _,
    DPK11_impl_04.replace _,
    DPK11_impl_05.replace _,
    DPK11_impl_06.replace _,
  )

  test("Replace single character token") {
    implementations.foreach { replace =>
      assert(replace(input1, ",", "-") == expected1)
    }
  }

  test("Replace multi-character token") {
    implementations.foreach { replace =>
      assert(
        replace(input1, ",World,", "-") ==
          expected2
      )
    }
  }

  test("Replace token not present") {
    implementations.foreach { replace =>
      assert(replace("Scala3", "Java", "Kotlin") == "Scala3")
    }
  }

  test("Replace entire string") {
    implementations.foreach { replace =>
      assert(replace("ABC", "ABC", "Z") == "Z")
    }
  }

  test("Replace with empty replacement") {
    implementations.foreach { replace =>
      assert(replace("A-B-C", "-", "") == "ABC")
    }
  }
}
