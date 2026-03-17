object DPK13_impl_04 {

  def fizzbuzz(): Array[Any] = {
    fizzbuzz(100)
  }

  def fizzbuzz(n: Int): Array[Any] = {

    val result = new Array[Any](n)

    var i = 1
    while (i <= n) {

      var value: Any = i

      if (i % 3 == 0) value = "Fizz"
      if (i % 5 == 0) {
        if (value == "Fizz") value = "FizzBuzz"
        else value = "Buzz"
      }

      result(i - 1) = value

      i = i + 1
    }

    result
  }
}
