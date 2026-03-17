object DPK13_impl_03 {

  def fizzbuzz(): Array[Any] = {
    fizzbuzz(100)
  }

  def fizzbuzz(n: Int): Array[Any] = {

    val result = new Array[Any](n)

    var i = 1
    while (i <= n) {

      val fizz = i % 3 == 0
      val buzz = i % 5 == 0

      if (fizz && buzz) result(i - 1) = "FizzBuzz"
      else if (fizz) result(i - 1) = "Fizz"
      else if (buzz) result(i - 1) = "Buzz"
      else result(i - 1) = i

      i = i + 1
    }

    result
  }
}
