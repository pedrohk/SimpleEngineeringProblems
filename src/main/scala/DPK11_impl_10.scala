object DPK11_impl_10 {

  def replace(str: String, token: String, newToken: String): String = {

    def matchAt(pos: Int): Boolean = {
      if (pos + token.length > str.length || token.length == 0) {
        false
      } else {
        var j = 0
        var ok = true
        while (j < token.length && ok) {
          if (str.charAt(pos + j) != token.charAt(j)) {
            ok = false
          }
          j = j + 1
        }
        ok
      }
    }

    val sb = new StringBuilder
    var i = 0

    while (i < str.length) {

      if (matchAt(i)) {

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