object DPK16_impl_09 {

  case class Position(var x: Int, var y: Int)

  class Mosquito(var pos: Position) {
    var alive = true
  }

  class Exterminator(var pos: Position) {
    def move(size: Int): Unit = {
      pos.x = scala.util.Random.nextInt(size)
      pos.y = scala.util.Random.nextInt(size)
    }
  }

  class Game {
    val size = 100
    var killed = 0

    val exterminator = new Exterminator(Position(0, 0))
    var mosquitos = scala.collection.mutable.ListBuffer.fill(10)(
      new Mosquito(Position(scala.util.Random.nextInt(size), scala.util.Random.nextInt(size)))
    )

    def tick(): Unit = {
      exterminator.move(size)

      if (mosquitos.size >= 2) {
        val m = mosquitos.head
        mosquitos += new Mosquito(Position(m.pos.x, m.pos.y))
      }

      mosquitos.foreach { m =>
        if (m.pos == exterminator.pos) {
          m.alive = false; killed += 1
        }
      }

      mosquitos = mosquitos.filter(_.alive)
    }

    def aliveCount = mosquitos.size

    def killedCount = killed
  }

}
