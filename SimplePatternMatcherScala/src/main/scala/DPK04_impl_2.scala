object DPK04_impl_2 {
  def pattern_matcher(c: String): String = {
    if (c == "Usa") "English"
    else if (c == "Brazil") "Portuguese"
    else if (c == "Spain") "Spanish"
    else if (c == "Italy") "Italian"
    else if (c == "France") "French"
    else if (c == "Germany") "German"
    else ""
  }
}
