object DPK01_impl_8 {
  def pattern_matcher(c: String): String = {
    val n =
      if (c == "Usa") 10
      else if (c == "Brazil") 20
      else if (c == "Spain") 30
      else if (c == "Italy") 40
      else if (c == "France") 50
      else if (c == "Germany") 60
      else 0

    if (n == 10) "English"
    else if (n == 20) "Portuguese"
    else if (n == 30) "Spanish"
    else if (n == 40) "Italian"
    else if (n == 50) "French"
    else if (n == 60) "German"
    else ""
  }
}
