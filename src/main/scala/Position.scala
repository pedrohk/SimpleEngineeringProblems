case class Position(var x: Int, var y: Int)

class Mosquito(var pos: Position) {
  var alive: Boolean = true
  var moves: Int = 0

  def moveRandom(size: Int): Unit = {
    val dx = scala.util.Random.between(-1, 2)
    val dy = scala.util.Random.between(-1, 2)
    pos.x = (pos.x + dx + size) % size
    pos.y = (pos.y + dy + size) % size
    moves += 1
  }
}

class Exterminator(var pos: Position) {
  var step = 0

  def moveDiagonal(size: Int): Unit = {
    pos.x = step % size
    pos.y = step % size
    step += 1
  }
}