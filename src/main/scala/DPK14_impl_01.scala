object DPK14_impl_01 {

  def move(grid: Array[Array[String]], start: (Int, Int), moves: Array[String]): Array[String] = {
    val rows = grid.length
    val cols = grid(0).length

    var r = start._1
    var c = start._2

    val result = new Array[String](moves.length)
    var count = 0

    var i = 0
    while (i < moves.length) {
      var nr = r
      var nc = c

      if (moves(i) == "up") nr -= 1
      else if (moves(i) == "down") nr += 1
      else if (moves(i) == "left") nc -= 1
      else if (moves(i) == "right") nc += 1

      if (nr >= 0 && nr < rows && nc >= 0 && nc < cols) {
        r = nr
        c = nc

        if (grid(r)(c) != "") {
          result(count) = grid(r)(c)
          count += 1
          grid(r)(c) = ""
        }
      }

      i += 1
    }

    val finalArr = new Array[String](count)
    var j = 0
    while (j < count) {
      finalArr(j) = result(j)
      j += 1
    }

    finalArr
  }
}
