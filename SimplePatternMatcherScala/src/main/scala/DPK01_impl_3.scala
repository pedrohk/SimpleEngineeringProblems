object DPK01_impl_3 {
  private val countries = Array("Usa", "Brazil", "Spain", "Italy", "France", "Germany")
  private val languages = Array("English", "Portuguese", "Spanish", "Italian", "French", "German")

  def pattern_matcher(c: String): String = {
    var i = 0
    while (i < countries.length) {
      if (countries(i) == c) return languages(i)
      i = i + 1
    }
    ""
  }
}
