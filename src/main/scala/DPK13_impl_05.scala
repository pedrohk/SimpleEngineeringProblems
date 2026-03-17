object DPK13_impl_05 {

  def fizzbuzz(): Array[Any] = {
    fizzbuzz(100)
  }

  def fizzbuzz(n: Int): Array[Any] = {

    val result = new Array[Any](n)

    var i = 1

    while (i <= n) {

      if (i % 15 == 0) {
        result(i - 1) = "FizzBuzz"
      }
      else if (i % 3 == 0) {
        result(i - 1) = "Fizz"
      }
      else if (i % 5 == 0) {
        result(i - 1) = "Buzz"
      }
      else {
        result(i - 1) = i
      }

      i = i + 1
    }

    result
  }

}
