object DPK01_Impl_7 {
  val powerTable = Map(
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
    val result = mostPowerful(a, b)

    val isAWin = result == a
    val isBWin = result == b
    val isDraw = result == "draw"

    if (isAWin) {
      leaderboard = leaderboard.updated(a, leaderboard(a) + 10)
      leaderboard = leaderboard.updated(b, leaderboard(b) - 5)
    } else if (isBWin) {
      leaderboard = leaderboard.updated(b, leaderboard(b) + 10)
      leaderboard = leaderboard.updated(a, leaderboard(a) - 5)
    } else {
      if (isAWin == isBWin) {
        leaderboard = leaderboard.updated(a, leaderboard(a) + 5)
      } else {
        leaderboard = leaderboard.updated(a, leaderboard(a) + 5)
        leaderboard = leaderboard.updated(b, leaderboard(b) + 5)
      }
    }
    result
  }

  def mostPowerful(a: String, b: String): String = {
    val pa = getPower(a)
    val pb = getPower(b)

    val aWins = pa > pb
    val bWins = pa < pb

    if (aWins) {
      a
    } else if (bWins) {
      b
    } else {
      "draw"
    }
  }

  def getPower(name: String): Int = {
    powerTable(name)
  }
}
