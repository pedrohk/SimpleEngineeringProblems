object DPK14_impl_04 {

  def move(grid: Array[Array[String]], start: (Int, Int), moves: Array[String]): Array[String] = {
    var r = start._1
    var c = start._2

    val tmp = new Array[String](moves.length)
    var idx = 0

    var i = 0
    while (i < moves.length) {
      var nr = r
      var nc = c

      if (moves(i) == "up") nr -= 1
      else if (moves(i) == "down") nr += 1
      else if (moves(i) == "left") nc -= 1
      else if (moves(i) == "right") nc += 1

      if (nr >= 0 && nr < grid.length && nc >= 0 && nc < grid(0).length) {
        r = nr
        c = nc

        if (grid(r)(c) != "") {
          tmp(idx) = grid(r)(c)
          idx += 1
          grid(r)(c) = ""
        }
      }

      i += 1
    }

    val out = new Array[String](idx)
    i = 0
    while (i < idx) {
      out(i) = tmp(i)
      i += 1
    }

    out
  }
}
