object DPK14_impl_07 {

  def move(grid: Array[Array[String]], start: (Int, Int), moves: Array[String]): Array[String] = {
    var r = start._1;
    var c = start._2
    val out = new Array[String](moves.length)
    var k = 0

    var i = 0
    while (i < moves.length) {
      val step = moves(i)
      val nr = if (step == "up") r - 1 else if (step == "down") r + 1 else r
      val nc = if (step == "left") c - 1 else if (step == "right") c + 1 else c

      if (!(nr < 0 || nr >= grid.length || nc < 0 || nc >= grid(0).length)) {
        r = nr;
        c = nc
        if (grid(r)(c) != "") {
          out(k) = grid(r)(c)
          k += 1
          grid(r)(c) = ""
        }
      }
      i += 1
    }

    out.slice(0, k)
  }
}
