object DPK13_impl_08 {

  def fizzbuzz(): Array[Any] = {
    fizzbuzz(100)
  }

  def fizzbuzz(n: Int): Array[Any] = {

    val result = new Array[Any](n)

    var fizz = 0
    var buzz = 0
    var i = 1

    while (i <= n) {

      fizz = fizz + 1
      buzz = buzz + 1

      if (fizz == 3 && buzz == 5) {
        result(i - 1) = "FizzBuzz"
        fizz = 0
        buzz = 0
      }
      else if (fizz == 3) {
        result(i - 1) = "Fizz"
        fizz = 0
      }
      else if (buzz == 5) {
        result(i - 1) = "Buzz"
        buzz = 0
      }
      else {
        result(i - 1) = i
      }

      i = i + 1
    }

    result
  }
}
