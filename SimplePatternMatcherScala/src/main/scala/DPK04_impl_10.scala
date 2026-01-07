object DPK04_impl_10 {
  def pattern_matcher(c: String): String = {
    val a = Array(
      ("Usa", "English"),
      ("Brazil", "Portuguese"),
      ("Spain", "Spanish"),
      ("Italy", "Italian"),
      ("France", "French"),
      ("Germany", "German")
    )
    var i = 0
    var r = ""
    while (i < a.length) {
      if (a(i)._1 == c) r = a(i)._2
      i = i + 1
    }
    r
  }
}
