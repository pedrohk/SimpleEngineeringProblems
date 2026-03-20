object DPK14_impl_03 {

  def nextPos(r: Int, c: Int, move: String): (Int, Int) = {
    if (move == "up") (r - 1, c)
    else if (move == "down") (r + 1, c)
    else if (move == "left") (r, c - 1)
    else if (move == "right") (r, c + 1)
    else (r, c)
  }

  def move(grid: Array[Array[String]], start: (Int, Int), moves: Array[String]): Array[String] = {
    var r = start._1
    var c = start._2

    val res = new Array[String](moves.length)
    var count = 0

    var i = 0
    while (i < moves.length) {
      val (nr, nc) = nextPos(r, c, moves(i))

      if (nr >= 0 && nr < grid.length && nc >= 0 && nc < grid(0).length) {
        r = nr
        c = nc

        if (grid(r)(c) != "") {
          res(count) = grid(r)(c)
          count += 1
          grid(r)(c) = ""
        }
      }

      i += 1
    }

    res.slice(0, count)
  }
}
