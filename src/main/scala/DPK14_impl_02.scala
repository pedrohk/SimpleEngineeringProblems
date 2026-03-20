object DPK14_impl_02 {

  def move(grid: Array[Array[String]], start: (Int, Int), moves: Array[String]): Array[String] = {
    var r = start._1
    var c = start._2

    val res = new Array[String](moves.length)
    var count = 0

    var i = 0
    while (i < moves.length) {
      val (nr, nc) = moves(i) match {
        case "up" => (r - 1, c)
        case "down" => (r + 1, c)
        case "left" => (r, c - 1)
        case "right" => (r, c + 1)
        case _ => (r, c)
      }

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

    val out = new Array[String](count)
    var j = 0
    while (j < count) {
      out(j) = res(j)
      j += 1
    }
    out
  }
}
