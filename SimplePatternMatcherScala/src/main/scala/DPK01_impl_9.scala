object DPK01_impl_9 {
  def pattern_matcher(c: String): String = {
    var r = ""
    if (c == "Usa") r = "English"
    else if (c == "Brazil") r = "Portuguese"
    else if (c == "Spain") r = "Spanish"
    else if (c == "Italy") r = "Italian"
    else if (c == "France") r = "French"
    else if (c == "Germany") r = "German"
    r
  }
}
