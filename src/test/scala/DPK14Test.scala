import org.scalatest.funsuite.AnyFunSuite

class DPK14Test extends AnyFunSuite {

  def baseGrid(): Array[Array[String]] = {
    Array(
      Array("Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"),
      Array("Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison")
    )
  }

  val implementations = Array(
    DPK14_impl_01.move _,
  )

  test("basic movement") {
    for (impl <- implementations) {
      val result = impl(baseGrid(), (0,0), Array("right"))
      assert(result.sameElements(Array("E.Honda")))
    }
  }

  test("ignore invalid moves") {
    for (impl <- implementations) {
      val result = impl(baseGrid(), (0,0), Array("up", "left"))
      assert(result.isEmpty)
    }
  }

  test("multiple kills") {
    for (impl <- implementations) {
      val result = impl(baseGrid(), (0,0), Array("right","right","down"))
      assert(result.sameElements(Array("E.Honda","Blanka","Zangief")))
    }
  }

  test("do not count start position") {
    for (impl <- implementations) {
      val result = impl(baseGrid(), (0,0), Array())
      assert(result.isEmpty)
    }
  }

}