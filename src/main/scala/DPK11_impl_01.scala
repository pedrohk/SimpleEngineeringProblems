object DPK11_impl_01 {

  def replace(str: String, token: String, newToken: String): String = {
    if (str == null || token == null) return str
    if (token.length == 0) return str

    val n = str.length
    val tlen = token.length
    val sb = new StringBuilder
    var i = 0
   
    while (i < n) {
      if (i + tlen <= n) {
        var j = 0
        var matchFound = true
        while (j < tlen && matchFound) {
          if (str.charAt(i + j) != token.charAt(j)) matchFound = false
          j += 1
        }
        if (matchFound) {
          sb.append(newToken)
          i += tlen
        } else {
          sb.append(str.charAt(i))
          i += 1
        }
      } else {
        sb.append(str.charAt(i))
        i += 1
      }
    }

    val intermediate = sb.toString
   
    if (token.indexOf(',') >= 0) {
      val sb2 = new StringBuilder
      var k = 0
      val m = intermediate.length
      while (k < m) {
        val c = intermediate.charAt(k)
        if (c == ',') {
          sb2.append(newToken)
        } else {
          sb2.append(c)
        }
        k += 1
      }
      sb2.toString
    } else {
      intermediate
    }
  }
}

