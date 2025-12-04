object DPK01_Impl_4 {
  var leaderboard = Map(
    "John" -> 0,
    "Paul" -> 0,
    "George" -> 0,
    "Ringo" -> 0
  )

  def play(a: String, b: String): String = {
    val res = mostPowerful(a, b)

    if (res == a) {
      leaderboard = leaderboard.updated(a, leaderboard(a) + 10)
      leaderboard = leaderboard.updated(b, leaderboard(b) - 5)
    } else if (res == b) {
      leaderboard = leaderboard.updated(b, leaderboard(b) + 10)
      leaderboard = leaderboard.updated(a, leaderboard(a) - 5)
    } else {
      if (a == b) {
        leaderboard = leaderboard.updated(a, leaderboard(a) + 5)
      } else {
        leaderboard = leaderboard.updated(a, leaderboard(a) + 5)
        leaderboard = leaderboard.updated(b, leaderboard(b) + 5)
      }
    }

    res
  }

  def mostPowerful(a: String, b: String): String = {
    val pa = getPower(a)
    val pb = getPower(b)

    if (pa > pb) {
      a
    } else if (pa < pb) {
      b
    } else {
      "draw"
    }
  }

  def getPower(name: String): Int = {
    if (name == "John") {
      100
    } else if (name == "Paul") {
      90
    } else if (name == "George") {
      80
    } else {
      70
    }
  }
}
