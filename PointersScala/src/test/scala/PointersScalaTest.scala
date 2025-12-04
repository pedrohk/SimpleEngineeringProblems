import org.scalatest.funsuite.AnyFunSuite

class PointersScalaTest extends AnyFunSuite {

  val impls = Seq(
    ("Impl1",  DPK01_Impl_1),
    ("Impl2",  DPK01_Impl_2),
    ("Impl3",  DPK01_Impl_3),
    ("Impl4",  DPK01_Impl_4)
  )


  def resetLeaderboard(impl: AnyRef): Unit = {
    val field = impl.getClass.getDeclaredFields.find(_.getName == "leaderboard").get
    field.setAccessible(true)
    field.set(impl, Map("John" -> 0, "Paul" -> 0, "George" -> 0, "Ringo" -> 0))
  }


  def getLeaderboard(impl: AnyRef): Map[String, Int] = {
    val field = impl.getClass.getDeclaredFields.find(_.getName == "leaderboard").get
    field.setAccessible(true)
    field.get(impl).asInstanceOf[Map[String, Int]]
  }

  test("getPower should return correct values") {
    impls.foreach { case (name, impl) =>
      assert(impl.getPower("John") == 100,  s"$name failed for John")
      assert(impl.getPower("Paul") == 90,   s"$name failed for Paul")
      assert(impl.getPower("George") == 80, s"$name failed for George")
      assert(impl.getPower("Ringo") == 70,  s"$name failed for Ringo")
    }
  }

  test("mostPowerful should correctly determine winners") {
    impls.foreach { case (name, impl) =>
      assert(impl.mostPowerful("John", "Paul") == "John", s"$name failed John vs Paul")
      assert(impl.mostPowerful("Paul", "George") == "Paul", s"$name failed Paul vs George")
      assert(impl.mostPowerful("Ringo", "George") == "George", s"$name failed Ringo vs George")
      assert(impl.mostPowerful("John", "John") == "draw", s"$name failed John vs John")
    }
  }

  test("play should update leaderboard correctly for wins") {
    impls.foreach { case (name, impl) =>
      resetLeaderboard(impl)

      val winner = impl.play("John", "Paul")
      assert(winner == "John", s"$name winner should be John")

      val lb = getLeaderboard(impl)

      assert(lb("John") == 10, s"$name John should have +10")
      assert(lb("Paul") == -5, s"$name Paul should have -5")
      assert(lb("George") == 0, s"$name George should be 0")
      assert(lb("Ringo") == 0, s"$name Ringo should be 0")
    }
  }

  test("play should update leaderboard correctly for loss") {
    impls.foreach { case (name, impl) =>
      resetLeaderboard(impl)

      val winner = impl.play("George", "John")
      assert(winner == "John", s"$name winner should be John")

      val lb = getLeaderboard(impl)

      assert(lb("John") == 10, s"$name John should have +10")
      assert(lb("George") == -5, s"$name George should have -5")
    }
  }

  test("play should update leaderboard correctly for draw") {
    impls.foreach { case (name, impl) =>
      resetLeaderboard(impl)

      val winner = impl.play("Paul", "Paul")
      assert(winner == "draw", s"$name should result in draw")

      val lb = getLeaderboard(impl)

      assert(lb("Paul") == 5, s"$name Paul should have +5 from draw")
    }
  }

  test("multiple sequential plays should accumulate scores") {
    impls.foreach { case (name, impl) =>
      resetLeaderboard(impl)

      impl.play("John", "Paul")

      impl.play("John", "Ringo")

      val lb = getLeaderboard(impl)

      assert(lb("John") == 20, s"$name John should be 20")
      assert(lb("Paul") == -5, s"$name Paul should be -5")
      assert(lb("Ringo") == -5, s"$name Ringo should be -5")
      assert(lb("George") == 0, s"$name George should still be 0")
    }
  }
}