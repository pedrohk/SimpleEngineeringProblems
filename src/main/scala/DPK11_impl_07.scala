object DPK11_impl_07 {

  def replace(str: String, token: String, newToken: String): String = {

    if (str.length == 0) return str

    val sb = new StringBuilder
    var i = 0

    while (i < str.length) {

      var matchFound = true
      var j = 0

      if (token.length > 0 && i + token.length <= str.length) {

        while (j < token.length && matchFound) {
          if (str.charAt(i + j) != token.charAt(j)) {
            matchFound = false
          }
          j = j + 1
        }

      } else {
        matchFound = false
      }

      if (matchFound) {

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