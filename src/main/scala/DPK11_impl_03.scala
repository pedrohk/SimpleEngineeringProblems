object DPK11_impl_03 {

  def replace(str: String, token: String, newToken: String): String = {
    if (str == null || token == null) return str
    if (token.length == 0) return str

    def loop(pos: Int, acc: StringBuilder): StringBuilder = {
      if (pos >= str.length) {
        acc
      } else {
        var m = true
        var x = 0
        while (x < token.length && pos + x < str.length && m) {
          if (str.charAt(pos + x) != token.charAt(x)) {
            m = false
          }
          x = x + 1
        }
        
        if (m && x == token.length) {
          acc.append(newToken)
          loop(pos + token.length, acc)
        } else {
          acc.append(str.charAt(pos))
          loop(pos + 1, acc)
        }
      }
    }

    val intermediate = loop(0, new StringBuilder).toString
    
    var hasComma = false
    var i = 0
    while (i < token.length && !hasComma) {
      if (token.charAt(i) == ',') hasComma = true
      i = i + 1
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