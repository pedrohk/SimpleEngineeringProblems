object DPK16_impl_01 {

  class Game {
    val size = 100
    var killed = 0

    val exterminator = new Exterminator(Position(0, 0))
    var mosquitos = scala.collection.mutable.ListBuffer.fill(10)(
      new Mosquito(Position(scala.util.Random.nextInt(size), scala.util.Random.nextInt(size)))
    )

    def tick(): Unit = {
      exterminator.moveDiagonal(size)

      val newborn = scala.collection.mutable.ListBuffer[Mosquito]()

      mosquitos.foreach { m =>
        if (m.alive) {
          m.moveRandom(size)

          if (m.pos == exterminator.pos) {
            m.alive = false
            killed += 1
          }

          if (m.moves >= 5 && mosquitos.exists(o => o != m && o.pos == m.pos)) {
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
