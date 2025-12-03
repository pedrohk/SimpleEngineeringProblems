object DPK01_Impl_2 {

  private val power = Map("John" -> 100, "Paul" -> 90, "George" -> 80, "Ringo" -> 70)
  private var leaderboard = Map("John" -> 0, "Paul" -> 0, "George" -> 0, "Ringo" -> 0)

  def play(a: String, b: String): String = {
    val result = mostPowerful(a, b)

    result match {
      case r if r == a =>
        leaderboard = leaderboard.updated(a, leaderboard(a) + 10)
        leaderboard = leaderboard.updated(b, leaderboard(b) - 5)
      case r if r == b =>
        leaderboard = leaderboard.updated(b, leaderboard(b) + 10)
        leaderboard = leaderboard.updated(a, leaderboard(a) - 5)
      case r if r == "draw" && a == b =>
        leaderboard = leaderboard.updated(a, leaderboard(a) + 5)
      case _ =>
        leaderboard = leaderboard.updated(a, leaderboard(a) + 5)
        leaderboard = leaderboard.updated(b, leaderboard(b) + 5)
    }

    result
  }

  def mostPowerful(a: String, b: String): String = {
    (getPower(a), getPower(b)) match {
      case (x, y) if x > y => a
      case (x, y) if x < y => b
      case _ => "draw"
    }
  }

  def getPower(name: String): Int = {
    name match {
      case "John" => 100
      case "Paul" => 90
      case "George" => 80
      case "Ringo" => 70
    }
  }
}
