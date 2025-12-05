object DPK01_Impl_5 {
  val people = Array("John", "Paul", "George", "Ringo")
  val powerVals = Array(100, 90, 80, 70)

  var leaderboard = Map(
    "John" -> 0,
    "Paul" -> 0,
    "George" -> 0,
    "Ringo" -> 0
  )

  def play(a: String, b: String): String = {
    val r = mostPowerful(a, b)

    r match {
      case n if n == a =>
        leaderboard = leaderboard.updated(a, leaderboard(a) + 10)
        leaderboard = leaderboard.updated(b, leaderboard(b) - 5)
      case n if n == b =>
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
    val pa = getPower(a)
    val pb = getPower(b)

    (pa, pb) match {
      case (x, y) if x > y => a
      case (x, y) if x < y => b
      case _ => "draw"
    }
  }

  def getPower(name: String): Int = {
    var i = 0
    while (i < people.length) {
      if (people(i) == name) {
        return powerVals(i)
      }
      i = i + 1
    }
    0
  }
}
