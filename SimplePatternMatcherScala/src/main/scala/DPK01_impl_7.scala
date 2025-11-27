object DPK01_impl_7 {
  case class Pair(k: String, v: String)

  private val arr = Array(
    Pair("Usa", "English"),
    Pair("Brazil", "Portuguese"),
    Pair("Spain", "Spanish"),
    Pair("Italy", "Italian"),
    Pair("France", "French"),
    Pair("Germany", "German")
  )

  def pattern_matcher(c: String): String = {
    var i = 0
    while (i < arr.length) {
      if (arr(i).k == c) return arr(i).v
      i = i + 1
    }
    ""
  }
}
