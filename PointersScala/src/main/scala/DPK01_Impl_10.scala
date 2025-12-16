object DPK01_Impl_10 {
  
  val players = Array("John", "Paul", "George", "Ringo")
  val power = Array(100, 90, 80, 70)

  var leaderboard = Map(
    "John" -> 0,
    "Paul" -> 0,
    "George" -> 0,
    "Ringo" -> 0
  )

  def play(a: String, b: String): String = {
    val winner = mostPowerful(a, b)

    if (winner == a) {
      leaderboard = leaderboard.updated(a, leaderboard(a) + 10)
      leaderboard = leaderboard.updated(b, leaderboard(b) - 5)
    } else if (winner == b) {
      leaderboard = leaderboard.updated(b, leaderboard(b) + 10)
      leaderboard = leaderboard.updated(a, leaderboard(a) - 5)
    } else if (a == b) {
      leaderboard = leaderboard.updated(a, leaderboard(a) + 5)
    } else {
      leaderboard = leaderboard.updated(a, leaderboard(a) + 5)
      leaderboard = leaderboard.updated(b, leaderboard(b) + 5)
    }

    winner
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
    var i = 0
    while (i < players.length) {
      if (players(i) == name) {
        return power(i)
      }
      i += 1
    }
    0
  }
}
