object DPK05_Impl_9 {

  val stats = Map(
    "John" -> 100,
    "Paul" -> 90,
    "George" -> 80,
    "Ringo" -> 70
  )

  var leaderboard = Map(
    "John" -> 0,
    "Paul" -> 0,
    "George" -> 0,
    "Ringo" -> 0
  )

  def play(a: String, b: String): String = {
    val r = mostPowerful(a, b)

    (r == a, r == b) match {
      case (true, _) =>
        leaderboard = leaderboard.updated(a, leaderboard(a) + 10)
        leaderboard = leaderboard.updated(b, leaderboard(b) - 5)
      case (_, true) =>
        leaderboard = leaderboard.updated(b, leaderboard(b) + 10)
        leaderboard = leaderboard.updated(a, leaderboard(a) - 5)
      case _ =>
        if (a == b) {
          leaderboard = leaderboard.updated(a, leaderboard(a) + 5)
        } else {
          leaderboard = leaderboard.updated(a, leaderboard(a) + 5)
          leaderboard = leaderboard.updated(b, leaderboard(b) + 5)
        }


    }

    r
  }

  def mostPowerful(a: String, b: String): String = {
    (getPower(a) > getPower(b), getPower(a) < getPower(b)) match {
      case (true, _) => a
      case (_, true) => b
      case _ => "draw"
    }
  }

  def getPower(name: String): Int = {
    stats(name)
  }
}
