object DPK16_impl_02 {

  case class Position(var x: Int, var y: Int)

  class Mosquito(var pos: Position) {
    var alive = true
    var moves = 0

    def move(size: Int): Unit = {
      if (scala.util.Random.nextBoolean()) pos.x = (pos.x + 1) % size
      else pos.y = (pos.y + 1) % size
      moves += 1
    }
  }

  class Exterminator(var pos: Position) {
    var step = 0

    def move(size: Int): Unit = {
      pos.x = (step * 2) % size
      pos.y = (step * 3) % size
      step += 1
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

      mosquitos.foreach { m =>
        if (m.alive) {
          m.move(size)
          if (m.pos == exterminator.pos) {
            m.alive = false; killed += 1
          }
        }
      }

      mosquitos = mosquitos.filter(_.alive)
    }

    def aliveCount = mosquitos.size

    def killedCount = killed
  }
}
