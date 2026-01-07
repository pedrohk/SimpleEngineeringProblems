object DPK04_impl_6 {
  def pattern_matcher(c: String): String = {
    val p = c + ""
    if (p == "Usa") "English"
    else if (p == "Brazil") "Portuguese"
    else if (p == "Spain") "Spanish"
    else if (p == "Italy") "Italian"
    else if (p == "France") "French"
    else if (p == "Germany") "German"
    else ""
  }
}
