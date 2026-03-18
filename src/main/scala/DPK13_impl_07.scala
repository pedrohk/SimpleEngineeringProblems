object DPK13_impl_07 {

  def fizzbuzz(): Array[Any] = {
    fizzbuzz(100)
  }

  def fizzbuzz(n: Int): Array[Any] = {

    val result = new Array[Any](n)

    var i = 1

    while (i <= n) {

      var text = ""

      if (i % 3 == 0) text = text + "Fizz"
      if (i % 5 == 0) text = text + "Buzz"

      if (text == "") result(i - 1) = i
      else result(i - 1) = text

      i = i + 1
    }

    result
  }
}
