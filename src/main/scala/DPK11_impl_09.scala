object DPK11_impl_09 {

  def replace(str: String, token: String, newToken: String): String = {
    var result = new StringBuilder
    var i = 0

    while (i < str.length) {

      var found = false

      if (i + token.length <= str.length && token.length > 0) {
        var j = 0
        found = true

        while (j < token.length && found) {
          if (str.charAt(i + j) != token.charAt(j)) {
            found = false
          }
          j = j + 1
        }
      }

      if (found) {

        result.append(newToken)
        i = i + token.length

      } else {

        val c = str.charAt(i)

        if (c == ',') {
          result.append(newToken)
        } else {
          result.append(c)
        }

        i = i + 1
      }
    }

    result.toString
  }
}