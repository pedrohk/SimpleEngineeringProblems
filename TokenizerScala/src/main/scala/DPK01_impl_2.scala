object DPK01_impl_2 {

  def tokenize(s: String, t: String): List[String] = {

    def loop(i: Int, cur: String, acc: List[String]): List[String] = {
      if (i == s.length) {
        (cur :: acc).reverse
      } else if (s.charAt(i) == t.charAt(0)) {
        loop(i + 1, "", cur :: acc)
      } else {
        loop(i + 1, cur + s.charAt(i), acc)
      }
    }

    loop(0, "", Nil)
  }
}
