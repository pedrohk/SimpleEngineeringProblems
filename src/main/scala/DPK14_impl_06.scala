object DPK14_impl_06 {

  def move(grid: Array[Array[String]], start: (Int, Int), moves: Array[String]): Array[String] = {
    var r = start._1;
    var c = start._2
    val res = new Array[String](moves.length)
    var count = 0

    for (i <- 0 until moves.length) {
      var nr = r;
      var nc = c
      if (moves(i) == "up") nr -= 1
      if (moves(i) == "down") nr += 1
      if (moves(i) == "left") nc -= 1
      if (moves(i) == "right") nc += 1

      if (nr >= 0 && nr < grid.length && nc >= 0 && nc < grid(0).length) {
        r = nr;
        c = nc
        if (grid(r)(c) != "") {
          res(count) = grid(r)(c)
          count += 1
          grid(r)(c) = ""
        }
      }
    }

    res.slice(0, count)
  }
}
