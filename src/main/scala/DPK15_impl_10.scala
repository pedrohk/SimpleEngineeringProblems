object DPK15_impl_10 {

  class Friends {
    private var list: List[Person] = List()

    def add(friend: Person): Unit = {
      if (!list.exists(_.getName() == friend.getName())) {
        list = list :+ friend
      }
    }

    def remove(friend: Person): Unit = {
      list = list.filterNot(_.getName() == friend.getName())
    }

    def all(): List[Person] = list
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

    def mostFriends(persons: List[Person]): Person = {
      persons.sortWith((a, b) => a.getFriends().size > b.getFriends().size).head
    }

    def leastFriends(persons: List[Person]): Person = {
      persons.sortWith((a, b) => a.getFriends().size < b.getFriends().size).head
    }

    def oldestFriend(persons: List[Person]): Person = {
      val allFriends = persons.flatMap(_.getFriends()).map(_.asInstanceOf[Person])
      allFriends.sortWith((a, b) => a.getAge() > b.getAge()).head
    }
  }
}
