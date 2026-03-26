import org.scalatest.funsuite.AnyFunSuite

class DPK15Test extends AnyFunSuite {

  test("DPK15_impl_01 should work correctly") {
    val john = new DPK15_impl_01.Person("John", 30)
    val paul = new DPK15_impl_01.Person("Paul", 28)
    val george = new DPK15_impl_01.Person("George", 27)
    val ringo = new DPK15_impl_01.Person("Ringo", 35)

    john.addFriend(paul)
    john.addFriend(george)
    john.addFriend(ringo)
    john.addFriend(paul)

    assert(john.getFriends().size == 3)

    john.removeFriend(george)
    assert(john.getFriends().size == 2)

    val people = List(john, paul, george, ringo)

    val most = DPK15_impl_01.SocialAnalytics.mostFriends(people)
    val least = DPK15_impl_01.SocialAnalytics.leastFriends(people)

    assert(most.getName() == "John")
    assert(least.getName() != null)

    val oldestFriend = DPK15_impl_01.SocialAnalytics.oldestFriend(people)
    assert(oldestFriend.getAge() == 35)
  }

  test("DPK15_impl_02 should work correctly") {
    val john = new DPK15_impl_02.Person("John", 30)
    val paul = new DPK15_impl_02.Person("Paul", 28)
    val george = new DPK15_impl_02.Person("George", 27)
    val ringo = new DPK15_impl_02.Person("Ringo", 35)

    john.addFriend(paul)
    john.addFriend(george)
    john.addFriend(ringo)
    john.addFriend(paul)

    assert(john.getFriends().size == 3)

    john.removeFriend(george)
    assert(john.getFriends().size == 2)

    val people = List(john, paul, george, ringo)

    val most = DPK15_impl_02.SocialAnalytics.mostFriends(people)
    val least = DPK15_impl_02.SocialAnalytics.leastFriends(people)

    assert(most.getName() == "John")
    assert(least.getName() != null)

    val oldestFriend = DPK15_impl_02.SocialAnalytics.oldestFriend(people)
    assert(oldestFriend.getAge() == 35)
  }

  test("DPK15_impl_03 should work correctly") {
    val john = new DPK15_impl_03.Person("John", 30)
    val paul = new DPK15_impl_03.Person("Paul", 28)
    val george = new DPK15_impl_03.Person("George", 27)
    val ringo = new DPK15_impl_03.Person("Ringo", 35)

    john.addFriend(paul)
    john.addFriend(george)
    john.addFriend(ringo)
    john.addFriend(paul)

    assert(john.getFriends().size == 3)

    john.removeFriend(george)
    assert(john.getFriends().size == 2)

    val people = List(john, paul, george, ringo)

    val most = DPK15_impl_03.SocialAnalytics.mostFriends(people)
    val least = DPK15_impl_03.SocialAnalytics.leastFriends(people)

    assert(most.getName() == "John")
    assert(least.getName() != null)

    val oldestFriend = DPK15_impl_03.SocialAnalytics.oldestFriend(people)
    assert(oldestFriend.getAge() == 35)
  }

  test("DPK15_impl_04 should work correctly") {
    val john = new DPK15_impl_04.Person("John", 30)
    val paul = new DPK15_impl_04.Person("Paul", 28)
    val george = new DPK15_impl_04.Person("George", 27)
    val ringo = new DPK15_impl_04.Person("Ringo", 35)

    john.addFriend(paul)
    john.addFriend(george)
    john.addFriend(ringo)
    john.addFriend(paul)

    assert(john.getFriends().size == 3)

    john.removeFriend(george)
    assert(john.getFriends().size == 2)

    val people = List(john, paul, george, ringo)

    val most = DPK15_impl_04.SocialAnalytics.mostFriends(people)
    val least = DPK15_impl_04.SocialAnalytics.leastFriends(people)

    assert(most.getName() == "John")
    assert(least.getName() != null)

    val oldestFriend = DPK15_impl_04.SocialAnalytics.oldestFriend(people)
    assert(oldestFriend.getAge() == 35)
  }

  test("DPK15_impl_05 should work correctly") {
    val john = new DPK15_impl_05.Person("John", 30)
    val paul = new DPK15_impl_05.Person("Paul", 28)
    val george = new DPK15_impl_05.Person("George", 27)
    val ringo = new DPK15_impl_05.Person("Ringo", 35)

    john.addFriend(paul)
    john.addFriend(george)
    john.addFriend(ringo)
    john.addFriend(paul)

    assert(john.getFriends().size == 3)

    john.removeFriend(george)
    assert(john.getFriends().size == 2)

    val people = List(john, paul, george, ringo)

    val most = DPK15_impl_05.SocialAnalytics.mostFriends(people)
    val least = DPK15_impl_05.SocialAnalytics.leastFriends(people)

    assert(most.getName() == "John")
    assert(least.getName() != null)

    val oldestFriend = DPK15_impl_05.SocialAnalytics.oldestFriend(people)
    assert(oldestFriend.getAge() == 35)
  }

  test("DPK15_impl_06 should work correctly") {
    val john = new DPK15_impl_06.Person("John", 30)
    val paul = new DPK15_impl_06.Person("Paul", 28)
    val george = new DPK15_impl_06.Person("George", 27)
    val ringo = new DPK15_impl_06.Person("Ringo", 35)

    john.addFriend(paul)
    john.addFriend(george)
    john.addFriend(ringo)
    john.addFriend(paul)

    assert(john.getFriends().size == 3)

    john.removeFriend(george)
    assert(john.getFriends().size == 2)

    val people = List(john, paul, george, ringo)

    val most = DPK15_impl_06.SocialAnalytics.mostFriends(people)
    val least = DPK15_impl_06.SocialAnalytics.leastFriends(people)

    assert(most.getName() == "John")
    assert(least.getName() != null)

    val oldestFriend = DPK15_impl_06.SocialAnalytics.oldestFriend(people)
    assert(oldestFriend.getAge() == 35)
  }

}
