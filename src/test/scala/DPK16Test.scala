import org.scalatest.funsuite.AnyFunSuite

import scala.reflect.Selectable.reflectiveSelectable

class DPK16Test extends AnyFunSuite {

  def runGame(game: { def tick(): Unit; def aliveCount: Int; def killedCount: Int }): Unit = {
    for (_ <- 1 to 30) {
      game.tick()
    }

    assert(game.killedCount >= 0)
    assert(game.aliveCount >= 0)
  }

  test("DPK16_impl_01") {
    runGame(new DPK16_impl_01.Game)
  }

  test("DPK16_impl_02") {
    runGame(new DPK16_impl_02.Game)
  }

  test("DPK16_impl_03") {
    runGame(new DPK16_impl_03.Game)
  }

  test("DPK16_impl_04") {
    runGame(new DPK16_impl_04.Game)
  }

}
