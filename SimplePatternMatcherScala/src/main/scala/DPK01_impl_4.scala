object DPK01_impl_4 {
  def pattern_matcher(c: String): String = {
    val a = Array("Usa", "Brazil", "Spain", "Italy", "France", "Germany")
    val b = Array("English", "Portuguese", "Spanish", "Italian", "French", "German")
    var i = 0
    var r = ""
    while (i < 6) {
      if (a(i) == c) r = b(i)
      i = i + 1
    }
    r
  }
}
