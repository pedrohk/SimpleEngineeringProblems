object DPK01_impl_7 {
      val data = List((1, "John"), (2, "Alice"), (3, "Bob"))

    def lookup(k: Int): String = {
      var r = ""
      var p = 0
      var arr = data.toArray
      while p < arr.length do {
        if arr(p)._1 == k then r = arr(p)._2
        p = p + 1
      }
      r
    }  
}
