object DPK11_impl_02 {

  def replace(str: String, token: String, newToken: String): String = {
    val result = new StringBuilder
    var index = 0
    val tlen = token.length

    while (index < str.length) {
      if (tlen > 0 && index + tlen <= str.length) {
        var k = 0
        var equal = true
        while (k < tlen && equal) {
          if (str.charAt(index + k) != token.charAt(k)) equal = false
          k += 1
        }
        if (equal) {
          result.append(newToken)
          index += tlen
        } else {
          result.append(str.charAt(index))
          index += 1
        }
      } else {
        result.append(str.charAt(index))
        index += 1
      }
    }
   
    if (tlen > 0 && token.charAt(0) == token.charAt(tlen - 1)) {
      val sep = token.charAt(0)
      val finalRes = new StringBuilder
      var i = 0
      while (i < result.length) {
        if (result.charAt(i) == sep) finalRes.append(newToken)
        else finalRes.append(result.charAt(i))
        i += 1
      }
      finalRes.toString
    } else {
      result.toString
    }
  }
}
