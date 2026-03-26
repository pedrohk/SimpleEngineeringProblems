object DPK15_impl_05 {

  class Friends {
    private var map: Map[String, Person] = Map()

    def add(friend: Person): Unit = {
      map = map + (friend.getName() -> friend)
    }

    def remove(friend: Person): Unit = {
      map = map - friend.getName()
    }

    def all(): List[Person] = map.values.toList
  }

  class Person(private val name: String, private val age: Int) extends PersonOps {
    private val friends = new Friends()

    def getName(): String = name

    def getAge(): Int = age

    def addFriend(friend: PersonOps): Unit =
      friends.add(friend.asInstanceOf[Person])

    def removeFriend(friend: PersonOps): Unit =
      friends.remove(friend.asInstanceOf[Person])

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
