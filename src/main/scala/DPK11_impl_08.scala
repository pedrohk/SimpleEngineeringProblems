object DPK11_impl_08 {

  def replace(str: String, token: String, newToken: String): String = {
    val sb = new StringBuilder
    var i = 0

    while (i < str.length) {

      var matched = true
      var j = 0

      while (j < token.length && matched && i + j < str.length) {
        if (str.charAt(i + j) != token.charAt(j)) {
          matched = false
        }
        j = j + 1
      }

      if (matched && j == token.length && token.length > 0) {
        sb.append(newToken)
        i = i + token.length
      } else {

        val c = str.charAt(i)

        if (c == ',') {
          sb.append(newToken)
        } else {
          sb.append(c)
        }

        i = i + 1
      }

    }

    sb.toString
  }
}