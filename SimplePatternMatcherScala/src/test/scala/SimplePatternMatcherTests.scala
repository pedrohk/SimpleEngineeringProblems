import org.scalatest.funsuite.AnyFunSuite

class SimplePatternMatcherTests extends AnyFunSuite {
  val data = Map(
    "Usa" -> "English",
    "Brazil" -> "Portuguese",
    "Spain" -> "Spanish",
    "Italy" -> "Italian",
    "France" -> "French",
    "Germany" -> "German"
  )

  val impls = Seq(
    DPK01_impl_1.pattern_matcher,
    DPK01_impl_2.pattern_matcher,
    DPK01_impl_3.pattern_matcher,
    DPK01_impl_4.pattern_matcher,
    DPK01_impl_5.pattern_matcher,
    DPK01_impl_6.pattern_matcher
  )

  test("all implementations return correct result") {
    for (impl <- impls) {
      for ((c, l) <- data) {
        assert(impl(c) == l)
      }
      assert(impl("Unknown") == "")
    }
  }

}
