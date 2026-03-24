object DPK14_impl_08 {

  def move(grid: Array[Array[String]], start: (Int, Int), moves: Array[String]): Array[String] = {
    var r = start._1;
    var c = start._2
    val res = new Array[String](moves.length)
    var idx = 0

    var i = 0
    while (i < moves.length) {
      val (nr, nc) =
        if (moves(i) == "up") (r - 1, c)
        else if (moves(i) == "down") (r + 1, c)
        else if (moves(i) == "left") (r, c - 1)
        else if (moves(i) == "right") (r, c + 1)
        else (r, c)

      if (nr >= 0 && nr < grid.length && nc >= 0 && nc < grid(0).length) {
        r = nr;
        c = nc
        val v = grid(r)(c)
        if (v != "") {
          res(idx) = v
          idx += 1
          grid(r)(c) = ""
        }
      }

      i += 1
    }

    res.slice(0, idx)
  }
}
