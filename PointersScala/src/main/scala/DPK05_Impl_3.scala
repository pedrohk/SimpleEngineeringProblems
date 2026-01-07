object DPK05_Impl_3 {

  private val names = Array("John", "Paul", "George", "Ringo")
  private val values = Array(100, 90, 80, 70)

  var leaderboard = Map("John" -> 0, "Paul" -> 0, "George" -> 0, "Ringo" -> 0)

  def play(a: String, b: String): String = {
    val r = mostPowerful(a, b)

    if (r == a) {
      leaderboard = leaderboard.updated(a, leaderboard(a) + 10)
      leaderboard = leaderboard.updated(b, leaderboard(b) - 5)
    } else if (r == b) {
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

    r
  }

  def mostPowerful(a: String, b: String): String = {
    val pa = getPower(a)
    val pb = getPower(b)

    if (pa > pb) a
    else if (pa < pb) b
    else "draw"
  }

  def getPower(name: String): Int = {
    var i = 0
    while (i < names.length) {
      if (names(i) == name) {
        return values(i)
      }
      i += 1
    }
    0
  }
}
