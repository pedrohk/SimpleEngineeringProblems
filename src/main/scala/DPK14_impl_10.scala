object DPK14_impl_10 {

  def move(grid: Array[Array[String]], start: (Int, Int), moves: Array[String]): Array[String] = {
    var r = start._1;
    var c = start._2
    val res = new Array[String](moves.length)
    var count = 0

    var i = 0
    while (i < moves.length) {
      val m = moves(i)
      var nr = r;
      var nc = c

      if (m == "up") nr = r - 1
      else if (m == "down") nr = r + 1
      else if (m == "left") nc = c - 1
      else if (m == "right") nc = c + 1

      if (nr >= 0 && nr < grid.length && nc >= 0 && nc < grid(0).length) {
        r = nr;
        c = nc
        val v = grid(r)(c)
        if (v != "") {
          res(count) = v
          count += 1
          grid(r)(c) = ""
        }
      }

      i += 1
    }

    res.slice(0, count)
  }
}
