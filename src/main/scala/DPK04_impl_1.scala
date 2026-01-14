object DPK04_impl_1 {
  def pattern_matcher(c: String): String = {
    c match {
      case "Usa" => "English"
      case "Brazil" => "Portuguese"
      case "Spain" => "Spanish"
      case "Italy" => "Italian"
      case "France" => "French"
      case "Germany" => "German"
      case _ => ""
    }
  }
}
