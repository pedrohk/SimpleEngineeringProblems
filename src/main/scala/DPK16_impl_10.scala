object DPK16_impl_10 {

  case class Position(var x: Int, var y: Int)

  class Mosquito(var pos: Position) {
    var alive = true

    def move(size: Int): Unit = {
      pos.x = scala.util.Random.nextInt(size)
      pos.y = scala.util.Random.nextInt(size)
    }
  }

  class Exterminator(var pos: Position) {
    var toggle = false

    def move(size: Int): Unit = {
      if (toggle) {
        pos.x = 0; pos.y = 0
      }
      else {
        pos.x = size - 1; pos.y = size - 1
      }
      toggle = !toggle
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
