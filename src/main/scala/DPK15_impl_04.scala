object DPK15_impl_04 {

  class Friends(private val list: List[Person] = List()) {

    def add(friend: Person): Friends = {
      if (list.exists(_.getName() == friend.getName())) this
      else new Friends(list :+ friend)
    }

    def remove(friend: Person): Friends = {
      new Friends(list.filterNot(_.getName() == friend.getName()))
    }

    def all(): List[Person] = list
  }

  class Person(private val name: String, private val age: Int) extends PersonOps {
    private var friends = new Friends()

    def getName(): String = name

    def getAge(): Int = age

    def addFriend(friend: PersonOps): Unit = {
      friends = friends.add(friend.asInstanceOf[Person])
    }

    def removeFriend(friend: PersonOps): Unit = {
      friends = friends.remove(friend.asInstanceOf[Person])
    }

    def getFriends(): List[PersonOps] = friends.all()
  }

  object SocialAnalytics {
    def mostFriends(persons: List[Person]): Person =
      persons.maxBy(_.getFriends().size)

    def leastFriends(persons: List[Person]): Person =
      persons.minBy(_.getFriends().size)

    def oldestFriend(persons: List[Person]): Person =
      persons.flatMap(_.getFriends()).map(_.asInstanceOf[Person]).maxBy(_.getAge())
  }
}
