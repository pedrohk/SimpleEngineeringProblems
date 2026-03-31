object DPK16_impl_05 {

  case class Position(var x: Int, var y: Int)

  class Mosquito(var pos: Position) {
    var alive = true

    def move(size: Int): Unit = {
      pos.x = scala.util.Random.nextInt(size)
      pos.y = scala.util.Random.nextInt(size)
    }
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

    def hit(a: Position, b: Position) =
      Math.abs(a.x - b.x) <= 1 && Math.abs(a.y - b.y) <= 1

    val exterminator = new Exterminator(Position(0, 0))
    var mosquitos = scala.collection.mutable.ListBuffer.fill(10)(
      new Mosquito(Position(scala.util.Random.nextInt(size), scala.util.Random.nextInt(size)))
    )

    def tick(): Unit = {
      exterminator.move(size)

      mosquitos.foreach { m =>
        if (m.alive) {
          m.move(size)
          if (hit(m.pos, exterminator.pos)) {
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
