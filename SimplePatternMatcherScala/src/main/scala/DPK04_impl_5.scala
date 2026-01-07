object DPK04_impl_5 {
  def pattern_matcher(c: String): String = {
    val x =
      if (c == "Usa") 1
      else if (c == "Brazil") 2
      else if (c == "Spain") 3
      else if (c == "Italy") 4
      else if (c == "France") 5
      else if (c == "Germany") 6
      else 0

    x match {
      case 1 => "English"
      case 2 => "Portuguese"
      case 3 => "Spanish"
      case 4 => "Italian"
      case 5 => "French"
      case 6 => "German"
      case _ => ""
    }
  }
}
