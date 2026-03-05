object DPK11_impl_04 {

  def replace(str: String, token: String, newToken: String): String = {
    val arr = new Array[Char](str.length * 2 + 10)
    var i = 0
    var r = 0
    while (i < str.length) {
      var matchFound = true
      var j = 0
      while (j < token.length && i + j < str.length && matchFound) {
        if (str.charAt(i + j) != token.charAt(j)) {
          matchFound = false
        }
        j = j + 1
      }
      if (token.length > 0 && matchFound && j == token.length) {
        var k = 0
        while (k < newToken.length) {
          arr(r) = newToken.charAt(k)
          r = r + 1
          k = k + 1
        }
        i = i + token.length
      } else {
        arr(r) = str.charAt(i)
        r = r + 1
        i = i + 1
      }
    }
    val intermediate = new String(arr, 0, r)

    var hasComma = false
    var p = 0
    while (p < token.length && !hasComma) {
      if (token.charAt(p) == ',') hasComma = true
      p = p + 1
    }

    if (hasComma) {
      val sb2 = new StringBuilder
      var k = 0
      while (k < intermediate.length) {
        val c = intermediate.charAt(k)
        if (c == ',') sb2.append(newToken) else sb2.append(c)
        k = k + 1
      }
      sb2.toString
    } else {
      intermediate
    }
  }
}