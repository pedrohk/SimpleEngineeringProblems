object DPK01_Impl_6 {
  
  val names = Array("John", "Paul", "George", "Ringo")
  val pvals = Array(100, 90, 80, 70)

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
    var i = 0
    var found = -1
    while (i < names.length) {
      if (names(i) == name) {
        found = i
      }
      i += 1
    }
    if (found >= 0) pvals(found) else 0
  }
}
