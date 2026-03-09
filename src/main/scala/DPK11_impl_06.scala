object DPK11_impl_06 {

  def replace(s: String, token: String, newToken: String): String = {
    if (s == null || token == null) return s
    if (token.length == 0) return s

    val buffer = new Array[Char](s.length * Math.max(1, newToken.length) + 10)
    var pos = 0
    var i = 0
    val tlen = token.length

    while (i < s.length) {
      var j = 0
      var ok = true
      while (j < tlen && i + j < s.length && ok) {
        if (s.charAt(i + j) != token.charAt(j)) ok = false
        j = j + 1
      }

      if (ok && j == tlen) {
        var k = 0
        while (k < newToken.length) {
          buffer(pos) = newToken.charAt(k)
          pos = pos + 1
          k = k + 1
        }
        i = i + tlen
      } else {
        buffer(pos) = s.charAt(i)
        pos = pos + 1
        i = i + 1
      }
    }

    val intermediate = new String(buffer, 0, pos)

    if (token.indexOf(',') >= 0) {
      val sb = new StringBuilder
      var idx = 0
      while (idx < intermediate.length) {
        val c = intermediate.charAt(idx)
        if (c == ',') sb.append(newToken) else sb.append(c)
        idx = idx + 1
      }
      sb.toString
    } else {
      intermediate
    }
  }

}
