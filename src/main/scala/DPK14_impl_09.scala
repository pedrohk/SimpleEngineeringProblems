object DPK14_impl_09 {

  def move(grid: Array[Array[String]], start: (Int, Int), moves: Array[String]): Array[String] = {
    var r = start._1;
    var c = start._2
    val res = new Array[String](moves.length)
    var count = 0

    var i = 0
    while (i < moves.length) {
      val m = moves(i)
      val nr = if (m == "up") r - 1 else if (m == "down") r + 1 else r
      val nc = if (m == "left") c - 1 else if (m == "right") c + 1 else c

      if (nr >= 0 && nr < grid.length && nc >= 0 && nc < grid(0).length) {
        r = nr;
        c = nc
        if (grid(r)(c).nonEmpty) {
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
