object DPK13_impl_10 {

  def fizzbuzz(): Array[Any] = {
    fizzbuzz(100)
  }

  def fizzbuzz(n: Int): Array[Any] = {

    val result = new Array[Any](n)

    var i = 1

    while (i <= n) {

      val value = i % 15

      if (value == 0) result(i - 1) = "FizzBuzz"
      else if (value == 3 || value == 6 || value == 9 || value == 12) result(i - 1) = "Fizz"
      else if (value == 5 || value == 10) result(i - 1) = "Buzz"
      else result(i - 1) = i

      i = i + 1
    }

    result
  }
}
