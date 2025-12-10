object DPK01_Impl_8 {

  val powerMap = Map(
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
    val diff = if (r == a) 1 else if (r == b) -1 else 0

    if (diff == 1) {
      leaderboard = leaderboard.updated(a, leaderboard(a) + 10)
      leaderboard = leaderboard.updated(b, leaderboard(b) - 5)
    } else if (diff == -1) {
      leaderboard = leaderboard.updated(b, leaderboard(b) + 10)
      leaderboard = leaderboard.updated(a, leaderboard(a) - 5)
    } else {
      if (diff == 0) {
        leaderboard = leaderboard.updated(a, leaderboard(a) + 5)
      } else {
        leaderboard = leaderboard.updated(a, leaderboard(a) + 5)
        leaderboard = leaderboard.updated(b, leaderboard(b) + 5)
      }
    }

    r
  }

  def mostPowerful(a: String, b: String): String = {
    val diff = getPower(a) - getPower(b)

    if (diff > 0) {
      a
    } else if (diff < 0) {
      b
    } else {
      "draw"
    }
  }

  def getPower(name: String): Int = {
    powerMap(name)
  }
}
