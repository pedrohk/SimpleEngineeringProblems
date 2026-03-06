object DPK11_impl_05 {

  def replace(str: String, token: String, newToken: String): String = {
    if (str == null || token == null) return str
    if (token.length == 0) return str

    val sb = new StringBuilder
    var i = 0
    val tlen = token.length

    while (i < str.length) {
      var equal = true
      var j = 0
      while (j < tlen && i + j < str.length && equal) {
        if (str.charAt(i + j) != token.charAt(j)) equal = false
        j += 1
      }
      if (equal && tlen > 0 && j == tlen) {
        sb.append(newToken)
        i += tlen
      } else {
        sb.append(str.charAt(i))
        i += 1
      }
    }

    val intermediate = sb.toString

    if (token.indexOf(',') >= 0) {
      val sb2 = new StringBuilder
      var k = 0
      while (k < intermediate.length) {
        val c = intermediate.charAt(k)
        if (c == ',') sb2.append(newToken) else sb2.append(c)
        k += 1
      }
      sb2.toString
    } else {
      intermediate
    }
  }
}
