object DPK13_impl_09 {

  def fizzbuzz(): Array[Any] = {
    fizzbuzz(100)
  }

  def fizzbuzz(n: Int): Array[Any] = {

    val result = new Array[Any](n)

    var i = 1

    while (i <= n) {

      val mod3 = i % 3
      val mod5 = i % 5

      if (mod3 == 0 && mod5 == 0) result(i - 1) = "FizzBuzz"
      else if (mod3 == 0) result(i - 1) = "Fizz"
      else if (mod5 == 0) result(i - 1) = "Buzz"
      else result(i - 1) = i

      i = i + 1
    }

    result
  }
}
