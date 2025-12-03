object DPK01_Impl_1 {

  private val power: Map[String, Int] = Map(
    "John" -> 100,
    "Paul" -> 90,
    "George" -> 80,
    "Ringo" -> 70
  )

  private var leaderboard: Map[String, Int] = Map(
    "John" -> 0,
    "Paul" -> 0,
    "George" -> 0,
    "Ringo" -> 0
  )

  def play(a: String, b: String): String = {
    val result = mostPowerful(a, b)

    if (result == a && result != "draw") {
      leaderboard = leaderboard.updated(a, leaderboard(a) + 10)
      leaderboard = leaderboard.updated(b, leaderboard(b) - 5)
    } else if (result == b && result != "draw") {
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

    result
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
    power(name)
  }
}
