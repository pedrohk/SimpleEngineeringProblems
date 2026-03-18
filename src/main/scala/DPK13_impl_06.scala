object DPK13_impl_06 {

  def fizzbuzz(): Array[Any] = {
    fizzbuzz(100)
  }

  def fizzbuzz(n: Int): Array[Any] = {

    val result = new Array[Any](n)

    var i = 1
    while (i <= n) {

      val key = (i % 3, i % 5)

      key match {
        case (0, 0) => result(i - 1) = "FizzBuzz"
        case (0, _) => result(i - 1) = "Fizz"
        case (_, 0) => result(i - 1) = "Buzz"
        case _ => result(i - 1) = i
      }

      i = i + 1
    }

    result
  }
}
