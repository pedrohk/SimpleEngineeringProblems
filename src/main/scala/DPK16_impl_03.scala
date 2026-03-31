object DPK16_impl_03 {

  case class Position(var x: Int, var y: Int)

  class Mosquito(var pos: Position) {
    var alive = true
    var moves = 0

    def move(size: Int): Unit = {
      pos.x = (pos.x + scala.util.Random.between(-1, 2) + size) % size
      pos.y = (pos.y + scala.util.Random.between(-1, 2) + size) % size
      moves += 1
    }
  }

  class Exterminator(var pos: Position) {
    var step = 0

    def move(size: Int): Unit = {
      pos.x = step % size
      pos.y = (step / 2) % size
      step += 1
    }
  }

  class Game {
    val size = 100
    var killed = 0

    def near(a: Position, b: Position) =
      Math.abs(a.x - b.x) <= 1 && Math.abs(a.y - b.y) <= 1

    val exterminator = new Exterminator(Position(0, 0))
    var mosquitos = scala.collection.mutable.ListBuffer.fill(10)(
      new Mosquito(Position(scala.util.Random.nextInt(size), scala.util.Random.nextInt(size)))
    )

    def tick(): Unit = {
      exterminator.move(size)
      val newborn = scala.collection.mutable.ListBuffer[Mosquito]()

      mosquitos.foreach { m =>
        if (m.alive) {
          m.move(size)

          if (m.pos == exterminator.pos) {
            m.alive = false; killed += 1
          }

          if (m.moves >= 5 && mosquitos.exists(o => o != m && near(o.pos, m.pos))) {
            newborn += new Mosquito(Position(m.pos.x, m.pos.y))
            m.moves = 0
          }
        }
      }

      mosquitos ++= newborn
      mosquitos = mosquitos.filter(_.alive)
    }

    def aliveCount = mosquitos.size

    def killedCount = killed
  }
}
