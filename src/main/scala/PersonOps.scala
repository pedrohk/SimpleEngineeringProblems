trait PersonOps {
    def getName(): String

    def getAge(): Int

    def addFriend(friend: PersonOps): Unit

    def removeFriend(friend: PersonOps): Unit

    def getFriends(): List[PersonOps]
}

